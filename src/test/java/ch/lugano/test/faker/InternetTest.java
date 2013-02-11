package ch.lugano.test.faker;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class InternetTest {

	@Test
	public void test() {
		
		assertNotNull(Internet.getDomainName());
		assertNotNull(Internet.getDomainSuffix());
		assertNotNull(Internet.getDomainWord());
		assertNotNull(Internet.getEmail());
		assertNotNull(Internet.getFreeEmail());
		assertNotNull(Internet.getIPv4Address());
		assertNotNull(Internet.getIPv6Address());		
		assertNotNull(Internet.getURL());
		assertNotNull(Internet.getUsername());
		
	}
	
}
