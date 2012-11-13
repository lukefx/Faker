package ch.lugano.test.faker;

import static org.junit.Assert.*;
import org.junit.Test;

public class FakerTest {

	@Test
	public void test() {
		
		assertNotNull(Faker.get("Name.name"));
		assertNotNull(Faker.get("Internet.email"));
		assertTrue(Faker.get("Internet.email").contains("@"));
		assertNotNull(Faker.get("Address.city"));
		assertNotNull(Faker.get("Company.name"));
		assertNotNull(Faker.get("PhoneNumber.phone_number"));
		assertNotNull(Faker.get("Lorem.paragraph"));
		
	}

}
