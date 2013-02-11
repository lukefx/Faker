package ch.lugano.test.faker;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhoneNumberTest {

	@Test
	public void test() {
		
		assertNotNull(PhoneNumber.getCellPhone());
		assertNotNull(PhoneNumber.getPhoneNumber());
		
	}
	
}
