package gen;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.*;

public class DomainNameFormatter {
	private static final byte END = 0x00;
	private static final byte PTR_MASK = -64;

	public static byte[] toBytes(String str) {
		int len = str.length() + 2;
		byte ret[] = new byte[len];
		int idx = 0;

		try {
			StringTokenizer tokenizer = new StringTokenizer(str, ".");

			while (tokenizer.hasMoreTokens()) {
				String component = tokenizer.nextToken();
				ret[idx++] = (byte) component.length();
				System.arraycopy(component.getBytes("US-ASCII"), 0, ret, idx, component.length());
				idx += component.length();
			}
			ret[idx] = END;
		} catch (UnsupportedEncodingException e) {
			// Cannot happen
			e.printStackTrace();
		}
		return ret;
	}

	public static String fromBytes(byte[] arr, int offset) {
		ByteBuffer buffer = ByteBuffer.wrap(arr);
		buffer.position(offset);

		byte length = buffer.get();
		if ((length & PTR_MASK) == PTR_MASK) {
			offset = (length & ~PTR_MASK) << 8;
			offset += buffer.get();
			buffer.position(offset);
			length = buffer.get();
		}

		StringBuffer buf = new StringBuffer();
		while (length != END) {
			byte[] tmp = new byte[length];
			buffer.get(tmp);
			String s = new String(tmp);
			buf.append(s);
			length = buffer.get();
			if (length != END)
				buf.append('.');
		}

		return buf.toString();
	}

	public static int size(String str) {
		return str.length() + 2;
	}

	public static int size(byte[] arr, int offset) {
		byte length = arr[offset];
		if ((length & PTR_MASK) == PTR_MASK)
			return 2;

		int i = offset + 1;
		for (; i < arr.length; i++)
			if (arr[i] == END)
				break;

		return i - offset + 1;
	}
}
