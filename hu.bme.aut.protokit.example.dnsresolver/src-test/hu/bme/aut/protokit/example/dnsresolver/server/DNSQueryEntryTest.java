package hu.bme.aut.protokit.example.dnsresolver.server;

import static hu.bme.aut.protokit.example.dnsresolver.server.DNSConstants.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gen.DNSQueryEntry;

public class DNSQueryEntryTest {
	private DNSQueryEntry orig;

	@Before
	public void setup() {
		orig = new DNSQueryEntry();
		orig.setName("example.com");
		orig.setType(RECORD_ALL);
		orig.setResourceClass(CLASS_IN);
	}

	@Test
	public void retainName() {
		byte[] data = orig.serialize();
		DNSQueryEntry deserialized = new DNSQueryEntry();
		DNSQueryEntry.deserialize(deserialized, data, 0);
		assertEquals(orig.getName(), deserialized.getName());
	}

	@Test
	public void retainType() {
		byte[] data = orig.serialize();
		DNSQueryEntry deserialized = new DNSQueryEntry();
		DNSQueryEntry.deserialize(deserialized, data, 0);
		assertEquals(orig.getType(), deserialized.getType());
	}

	@Test
	public void retainResourceClass() {
		byte[] data = orig.serialize();
		DNSQueryEntry deserialized = new DNSQueryEntry();
		DNSQueryEntry.deserialize(deserialized, data, 0);
		assertEquals(orig.getResourceClass(), deserialized.getResourceClass());
	}

	@Test
	public void testEquals() {
		byte[] data = orig.serialize();
		DNSQueryEntry deserialized = new DNSQueryEntry();
		DNSQueryEntry.deserialize(deserialized, data, 0);
		assertTrue(orig.equals(deserialized));
		assertTrue(deserialized.equals(orig));
	}
	
	@Test
	public void testHashCode() {
		byte[] data = orig.serialize();
		DNSQueryEntry deserialized = new DNSQueryEntry();
		DNSQueryEntry.deserialize(deserialized, data, 0);
		assertEquals(orig.hashCode(), deserialized.hashCode());
	}
}
