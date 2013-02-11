package ch.lugano.test.faker;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AddressTest {

	@Test
	public void test() {
		
		assertNotNull(Address.getBuildingNumber());
		assertNotNull(Address.getCity());
		assertNotNull(Address.getCityPrefix());
		assertNotNull(Address.getCitySuffix());
		assertNotNull(Address.getCountry());
		assertNotNull(Address.getLatitude());
		assertNotNull(Address.getLongitute());
		assertNotNull(Address.getSecondaryAddress());
		assertNotNull(Address.getState());
		assertNotNull(Address.getStateAbbr());
		assertNotNull(Address.getStreetAddress(false));
		assertNotNull(Address.getStreetName());
		assertNotNull(Address.getStreetSuffix());
		// assertNotNull(Address.getTimeZone());
		
	}
	
}
