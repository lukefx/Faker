package ch.lugano.test.faker;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CompanyTest {
	
	@Test
	public void test() {
		
		assertNotNull(Company.getBS());
		assertNotNull(Company.getCatchPhrase());
		assertNotNull(Company.getName());
		assertNotNull(Company.getSuffix());
		
	}
	
}
