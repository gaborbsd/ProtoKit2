package hu.bme.aut.protokit.example.dnsresolver.server;

public class DNSConstants {
	public static final long REQUEST = 0x0l;
	public static final long RESPONSE = 0x1l;
	public static final long OPCODE_QUERY = 0x0l;
	public static final long AUTHORITATIVE = 0x1l;
	public static final long NOT_AUTHORITATIVE = 0x0l;
	public static final long TRUNCATED = 0x0l;
	public static final long NOT_TRUNCATED = 0x1l;
	public static final long RECURSION = 0x1l;
	public static final long NO_RECURSION = 0x0l;
	public static final long RET_OK = 0x0l;
	public static final long RET_DOMAIN_ERROR = 0x3l;
	
	public static final long RECORD_A = 0x01l;
	public static final long RECORD_NS = 0x02l;
	public static final long RECORD_CNAME = 0x05l;
	public static final long RECORD_PTR = 0x0cl;
	public static final long RECORD_MX = 0x0fl;
	public static final long RECORD_SRV = 0x21l;
	public static final long RECORD_IXFR = 0xfbl;
	public static final long RECORD_AXFR = 0xfcl;
	public static final long RECORD_ALL = 0xffl;
	
	public static final long CLASS_IN = 0x0001l;
	
}
