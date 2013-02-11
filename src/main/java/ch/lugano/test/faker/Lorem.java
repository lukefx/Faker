package ch.lugano.test.faker;

import java.util.ArrayList;
import java.util.List;


/**
 * characters(char_count = 255)
 * paragraph(sentence_count = 3, supplemental = false)
 * paragraphs(paragraph_count = 3, supplemental = false)
 * sentence(word_count = 4, supplemental = false)
 * sentences(sentence_count = 3, supplemental = false)
 * word
 * words(num = 3, supplemental = false)
 * @author lsimone
 *
 */
public class Lorem extends Faker {

	public static String getCharacters() {
		return (String) eval("Faker::Lorem.characters");
	}
	
	public static String getCharacters(int charCount) {
		return (String) eval(String.format("Faker::Lorem.characters(%d)", charCount));
	}
	
	public static String getParagraph(int paragraphCount) {
		return (String) eval(String.format("Faker::Lorem.paragraph(%d)", paragraphCount));
	}
	
	public static Object getParagraphs(int paragraphCount) {
		return (Object) eval(String.format("Faker::Lorem.paragraphs(%d)", paragraphCount));
	}
	
	public static String getSentence(int wordCount) {
		return (String) eval(String.format("Faker::Lorem.sentence(%d)", wordCount));
	}
	
	public static Object getSentences(int sentenceCount) {
		return eval(String.format("Faker::Lorem.sentences(%d)", sentenceCount));
	}

	public static String getWord(int charCount) {
		return (String) eval("Faker::Lorem.word");
	}
	
	public static Object getWords(int num) {
		return eval(String.format("Faker::Lorem.words(%d)", num));
	}
}
