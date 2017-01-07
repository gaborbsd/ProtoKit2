package hu.bme.aut.protokit.example.dnsresolver.server;

import static hu.bme.aut.protokit.example.dnsresolver.server.DNSConstants.*;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

import gen.DNSMessage;
import gen.DNSQueryEntry;
import gen.DNSResourceRecord;

/**
 * Resolver thread that resolves a single query from a remote DNS
 * server.
 * 
 * @author Gábor Kövesdán <gabor.kovesdan@aut.bme.hu>
 *
 */
public class ForwarderThread implements Callable<DNSResourceRecord> {
	private static final byte[] DNS_SERVER = new byte[] { 8, 8, 8, 8 };
	private static final int DNS_PORT = 53;
	
	private static Logger logger = Logger.getLogger("ResolverThread");
	private static long counter = 1l;

	private DNSQueryEntry query;

	public ForwarderThread(DNSQueryEntry query) {
		this.query = query;
	}

	@Override
	public DNSResourceRecord call() {
		logger.finer("Resolving " + query.getResourceClass() + " "
				+ query.getType() + " " + query.getName());

		try {
			// use Google DNS to resolve names
			InetSocketAddress server = new InetSocketAddress(
					InetAddress.getByAddress(DNS_SERVER), DNS_PORT);
			DatagramChannel clientChannel = DatagramChannel.open(StandardProtocolFamily.INET);
			clientChannel.connect(server);

			// compose request
			DNSMessage msg = new DNSMessage();
			msg.setTransactionID(counter++);
			msg.setResponse(0l);
			msg.setNeedRecursion(1l);
			msg.setOpCode(OPCODE_QUERY);
			msg.getQueries().add(query);

			// send request
			logger.fine("Resolving query " + query.getName() + " "
					+ query.getType() + " " + query.getResourceClass());
			ByteBuffer buffer = ByteBuffer.wrap(msg.serialize());
			clientChannel.send(buffer, server);

			// receive answer
			ByteBuffer recv = ByteBuffer.allocate(2048);
			clientChannel.receive(recv);
			recv.flip();

			// process answer
			DNSMessage response = new DNSMessage(); 
			DNSMessage.deserialize(response, recv.array(), 0);
			if (response.getReturnCode() != RET_OK) {
				logger.fine("Could not resolve query " + query.getName() + " "
						+ query.getType() + " " + query.getResourceClass());
			} else {
				Optional<DNSResourceRecord> record = response.getAnswers().stream().filter(r -> r.getQuery().equals(query)).findFirst();
				if (record.isPresent()) {
					logger.finer("Resolved " + query.getResourceClass() + " "
							+ query.getType() + " " + query.getName());
					return record.get();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
