package hu.bme.aut.protokit.example.dnsresolver.server;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.logging.Logger;

import gen.DNSMessage;

/**
 * Main application class listening on port 53. Starts a worker thread for each
 * query.
 * 
 * @author Gábor Kövesdán <gabor.kovesdan@aut.bme.hu>
 *
 */
public class CachingDNSServer {
	private static Logger logger = Logger.getLogger("CachingDNSServer");

	public static void main(String[] args) throws Exception {
		new CachingDNSServer().start();
	}

	public void start() throws Exception {
		logger.info("Initializing server...");

		DatagramChannel channel = DatagramChannel.open(StandardProtocolFamily.INET);
		channel.bind(new InetSocketAddress(53));
		channel.setOption(StandardSocketOptions.IP_TOS, 0b1000);
		channel.configureBlocking(true);

		logger.info("Server started.");

		while (true) {
			ByteBuffer reqBuf = ByteBuffer.allocate(2048);

			SocketAddress client = null;
			client = channel.receive(reqBuf);

			reqBuf.flip();
			DNSMessage request = new DNSMessage();
			DNSMessage.deserialize(request, reqBuf.array(), 0);

			// start thread to answer request
			new Thread(new WorkerThread(request, channel, client)).start();
		}
	}
}
