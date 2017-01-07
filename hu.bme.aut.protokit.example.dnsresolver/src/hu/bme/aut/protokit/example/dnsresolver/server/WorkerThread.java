package hu.bme.aut.protokit.example.dnsresolver.server;

import static hu.bme.aut.protokit.example.dnsresolver.server.DNSConstants.*;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

import gen.DNSMessage;
import gen.DNSQueryEntry;
import gen.DNSResourceRecord;
import gen.DomainNameFormatter;

/**
 * Thread class to answer a single DNS query. When possible, the query is
 * answered from the cache; otherwise, a new thread is launched to resolve
 * the query.
 * 
 * @author Gábor Kövesdán <gabor.kovesdan@aut.bme.hu>
 *
 */
public class WorkerThread implements Runnable {
	private static final int NTHREADS = 2;
	private static final int TIMEOUT_MSEC = 2000;
	private static ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
	private static Logger logger = Logger.getLogger("WorkerThread");

	/**
	 * Cache
	 */
	private static Map<DNSQueryEntry, DNSResourceRecord> cache = new HashMap<>();

	/**
	 * Initiaizes cache.
	 */
	static {
		long curTime = new Date().getTime();
		
		DNSQueryEntry query = new DNSQueryEntry();
		query.setName("1.0.0.127.in-addr.arpa");
		query.setType(RECORD_PTR);
		query.setResourceClass(CLASS_IN);
		DNSResourceRecord rr = new DNSResourceRecord();
		rr.setQuery(query);
		rr.setTtl(Integer.MAX_VALUE / 1000);
		rr.setData(DomainNameFormatter.toBytes("localhost"));
		rr.setCreated(curTime);
		synchronized (cache) {
			cache.put(query, rr);
		}
	}

	private DNSMessage request;
	private DatagramChannel channel;
	private SocketAddress client;

	public WorkerThread(DNSMessage request, DatagramChannel channel, SocketAddress client) {
		this.request = request;
		this.channel = channel;
		this.client = client;
	}

	@Override
	public void run() {
		List<Future<DNSResourceRecord>> results = new ArrayList<>();
		boolean hasUnresolvedQueries = false;

		// process all resolving tasks in the request
		for (DNSQueryEntry query : request.getQueries()) {
			logger.fine("Resolving query: " + query.getName() + " " + query.getType() + " " + query.getResourceClass());
			
			// try cache first
			DNSResourceRecord rr = cache.get(query);
			
			// uncached or expired
			if ((rr == null) || (rr.getCreated() + rr.getTtl() * 1000 < new Date().getTime())) {
				
				// forward resolving task in a separate thread
				ForwarderThread resolver = new ForwarderThread(query);
				Future<DNSResourceRecord> future = executor.submit(resolver);
				results.add(future);

				// remove expired entry from cache
				if (rr != null) {
					synchronized (cache) {
						cache.remove(rr);
					}
				}

			// use cached value
			} else {
				request.getAnswers().add(rr);
			}
		}

		try {
			// process resolved names
			for (Future<DNSResourceRecord> f : results) {
				DNSResourceRecord rr = f.get(TIMEOUT_MSEC, TimeUnit.MILLISECONDS);
				
				// if successful, add them to the answer and to the cache
				if (rr != null) {
					rr.setCreated(new Date().getTime());
					request.getAnswers().add(rr);
					synchronized (cache) {
						cache.put(rr.getQuery(), rr);
					}
				} else {
					hasUnresolvedQueries = true;
				}
			}
		} catch (InterruptedException | ExecutionException e1) {
			e1.printStackTrace();
		} catch (TimeoutException e) {
			hasUnresolvedQueries = true;
		}
		
		if (hasUnresolvedQueries) {
			request.setReturnCode(RET_DOMAIN_ERROR);
			logger.finer("Could not resolve all of the queries in the message " + request.getTransactionID()
					+ " from client " + client);
		} else {
			request.setReturnCode(RET_OK);
		}

		// serialize answer
		request.setResponse(1l);
		ByteBuffer answer = ByteBuffer.wrap(request.serialize());
		logger.finest("Sending answer for request " + request.getTransactionID() + " to client " + client);
		
		try {
			channel.send(answer, client);
			logger.finest("Sent answer for request " + request.getTransactionID() + " to client " + client);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}