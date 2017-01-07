package hu.bme.aut.protokit.runtime;

import java.nio.ByteBuffer;

public class ProtoUtil {

	private static byte getNthByteFromLong(long l, int n) {
		return (byte)((l & (0xff << n * 8)) >> (n * 8));
	}
	
	public static byte[] longToBytes(long l, int size) {
		ByteBuffer buf = ByteBuffer.allocate(size);
		for (int i = 0; i < size; i++)
			buf.put(getNthByteFromLong(l, size - i - 1));
		return buf.array();
	}
	
	public static long bytesToLong(byte[] buf, int offset, int l) {
		long ret = 0;
		
		for (int i = offset; i < offset + l; i++) {
			ret <<= 8;
			ret += Byte.toUnsignedInt(buf[i]);
		}
		
		return ret;
	}
}
