package ch.lugano.test.faker;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LoremTest {

	@Test
	public void test() {

		assertNotNull(Lorem.getCharacters());
		assertNotNull(Lorem.getCharacters(255));
		assertNotNull(Lorem.getParagraph(1));
		assertNotNull(Lorem.getParagraphs(1));
		assertNotNull(Lorem.getSentence(1));
		assertNotNull(Lorem.getSentences(1));
		assertNotNull(Lorem.getWord(5));
		assertNotNull(Lorem.getWords(5));
		
	}
	
}
