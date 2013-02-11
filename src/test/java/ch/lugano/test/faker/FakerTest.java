package ch.lugano.test.faker;

import static org.junit.Assert.*;
import org.junit.Test;

public class FakerTest {

	@Test
	public void test() {

		assertNotNull(Faker.get("Internet.name"));
		assertNotNull(Faker.get("Internet.name", "de-ch"));
	}

}
