package hu.bme.aut.protokit.example.dnsresolver.server;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import static hu.bme.aut.protokit.example.dnsresolver.server.DNSConstants.*;

import org.junit.Before;
import org.junit.Test;

import gen.DNSMessage;
import gen.DNSQueryEntry;
import gen.DNSResourceRecord;

public class DNSMessageTest {
	private DNSMessage orig;
	
	@Test
	public void testResponse0() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		DNSMessage msg = new DNSMessage();
		msg.setResponse(REQUEST);
		Class<DNSMessage> cl = DNSMessage.class;
		Field f = cl.getDeclaredField("flags");
		f.setAccessible(true);
		byte[] flags = (byte[]) f.get(msg);
		assertEquals(0b0, msg.getResponse());
		assertEquals("Binary representation: " + Integer.toBinaryString(flags[0]), 0b0000_0000, Byte.toUnsignedInt(flags[0]));
	}
	
	@Test
	public void testResponse1() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		DNSMessage msg = new DNSMessage();
		msg.setResponse(RESPONSE);
		Class<DNSMessage> cl = DNSMessage.class;
		Field f = cl.getDeclaredField("flags");
		f.setAccessible(true);
		byte[] flags = (byte[]) f.get(msg);
		assertEquals(0b1, msg.getResponse());
		assertEquals("Binary representation: " + Integer.toBinaryString(flags[0]), 0b1000_0000, Byte.toUnsignedInt(flags[0]));
	}
	
	@Test
	public void testOpCode() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		DNSMessage msg = new DNSMessage();
		msg.setOpCode(0b1111);
		Class<DNSMessage> cl = DNSMessage.class;
		Field f = cl.getDeclaredField("flags");
		f.setAccessible(true);
		byte[] flags = (byte[]) f.get(msg);
		assertEquals(0b1111, msg.getOpCode());
		assertEquals("Binary representation: " + Integer.toBinaryString(flags[0]), 0b0111_1000, Byte.toUnsignedInt(flags[0]));
	}
	
	@Test
	public void testReturnCode() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		DNSMessage msg = new DNSMessage();
		msg.setReturnCode(0b1111);
		Class<DNSMessage> cl = DNSMessage.class;
		Field f = cl.getDeclaredField("flags");
		f.setAccessible(true);
		byte[] flags = (byte[]) f.get(msg);
		assertEquals(0b1111, msg.getReturnCode());
		assertEquals("Binary representation: " + Integer.toBinaryString(flags[1]), 0b0000_1111, Byte.toUnsignedInt(flags[1]));
	}
	
	@Before
	public void setup() {
		orig = new DNSMessage();
		orig.setTransactionID(12);
		orig.setResponse(RESPONSE);
		orig.setOpCode(OPCODE_QUERY);
		orig.setAuthoritative(AUTHORITATIVE);
		orig.setTruncation(TRUNCATED);
		orig.setRecursionAvail(RECURSION);
		orig.setReserved(7);
		orig.setReturnCode(RET_DOMAIN_ERROR);
		
		DNSQueryEntry entry = new DNSQueryEntry();
		entry.setName("example.com");
		entry.setType(RECORD_A);
		entry.setResourceClass(CLASS_IN);
		orig.getQueries().add(entry);
		
		entry = new DNSQueryEntry();
		entry.setName("bar.foobar.org");
		entry.setType(RECORD_ALL);
		entry.setResourceClass(CLASS_IN);
		orig.getQueries().add(entry);
		
		DNSResourceRecord rr = new DNSResourceRecord();
		rr.setQuery(entry);
		rr.setTtl(12345);
		rr.setData(new byte[] {0, 0, 0, 1});
		orig.getAnswers().add(rr);
		
		orig.getAuthorities().add(rr);
		
		orig.getAdditionals().add(rr);
	}
	

	@Test
	public void retainTransactionID() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getTransactionID(), deserialized.getTransactionID());
	}
	
	@Test
	public void retainResponse() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getResponse(), deserialized.getResponse());
	}
	
	@Test
	public void retainOpCode() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getOpCode(), deserialized.getOpCode());
	}
	
	@Test
	public void retainAuthoritative() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAuthoritative(), deserialized.getAuthoritative());
	}
	
	@Test
	public void retainTruncation() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getTruncation(), deserialized.getTruncation());
	}
	
	@Test
	public void retainRecursionAvail() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getRecursionAvail(), deserialized.getRecursionAvail());
	}
	
	@Test
	public void retainReserved() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getReserved(), deserialized.getReserved());
	}
	
	@Test
	public void retainReturnCode() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getReturnCode(), deserialized.getReturnCode());
	}
	
	@Test
	public void retainQueryCount() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getQuestionRRCount(), deserialized.getQuestionRRCount());
	}
	
	@Test
	public void retainQueries() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getQueries(), deserialized.getQueries());
	}
	
	@Test
	public void retainAnswerCount() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAnswerRRCount(), deserialized.getAnswerRRCount());
	}
	
	@Test
	public void retainAnswers() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAnswers(), deserialized.getAnswers());
	}

	@Test
	public void retainAuthorityCount() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAuthorityRRCount(), deserialized.getAuthorityRRCount());
	}
	
	@Test
	public void retainAuthorities() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAuthorities(), deserialized.getAuthorities());
	}
	
	@Test
	public void retainAdditionalCount() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAdditionalRRCount(), deserialized.getAdditionalRRCount());
	}
	
	@Test
	public void retainAdditionals() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.getAdditionals(), deserialized.getAdditionals());
	}
	
	@Test
	public void testEquals() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertTrue(orig.equals(deserialized));
		assertTrue(deserialized.equals(orig));
	}
	
	@Test
	public void testHashCode() {
		byte [] data = orig.serialize();
		DNSMessage deserialized = new DNSMessage();
		DNSMessage.deserialize(deserialized, data, 0);
		assertEquals(orig.hashCode(), deserialized.hashCode());
	}
}
