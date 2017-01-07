package hu.bme.aut.protokit.example.dnsresolver.server;

import static hu.bme.aut.protokit.example.dnsresolver.server.DNSConstants.CLASS_IN;
import static hu.bme.aut.protokit.example.dnsresolver.server.DNSConstants.RECORD_A;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gen.DNSQueryEntry;
import gen.DNSResourceRecord;

public class DNSResourceRecordTest {
	private DNSResourceRecord orig;

	@Before
	public void setup() {
		DNSQueryEntry entry = new DNSQueryEntry();
		entry.setName("example.com");
		entry.setType(RECORD_A);
		entry.setResourceClass(CLASS_IN);
		
		orig = new DNSResourceRecord();
		orig.setQuery(entry);
		orig.setTtl(12345);
		orig.setData(new byte[] { 0, 0, 0, 1 });
	}
	
	@Test
	public void retainQuery() {
		byte [] data = orig.serialize();
		DNSResourceRecord deserialized =  new DNSResourceRecord();
		DNSResourceRecord.deserialize(deserialized, data, 0);
		assertEquals(orig.getQuery(), deserialized.getQuery());
	}
	
	@Test
	public void retainTtl() {
		byte [] data = orig.serialize();
		DNSResourceRecord deserialized =  new DNSResourceRecord();
		DNSResourceRecord.deserialize(deserialized, data, 0);
		assertEquals(orig.getTtl(), deserialized.getTtl());
	}
	
	@Test
	public void retainData() {
		byte [] data = orig.serialize();
		DNSResourceRecord deserialized =  new DNSResourceRecord();
		DNSResourceRecord.deserialize(deserialized, data, 0);
		assertArrayEquals(orig.getData(), deserialized.getData());
	}
	
	@Test
	public void testEquals() {
		byte [] data = orig.serialize();
		DNSResourceRecord deserialized =  new DNSResourceRecord();
		DNSResourceRecord.deserialize(deserialized, data, 0);
		assertTrue(orig.equals(deserialized));
		assertTrue(deserialized.equals(orig));
	}
	
	@Test
	public void testHashCode() {
		byte [] data = orig.serialize();
		DNSResourceRecord deserialized =  new DNSResourceRecord();
		DNSResourceRecord.deserialize(deserialized, data, 0);
		assertEquals(orig.hashCode(), deserialized.hashCode());
	}
}
