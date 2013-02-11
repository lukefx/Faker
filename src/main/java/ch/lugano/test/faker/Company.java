package ch.lugano.test.faker;

public class Company extends Faker {

	public static String getBS() {
		return (String) eval("Faker::Company.bs");
	}

	public static String getCatchPhrase() {
		return (String) eval("Faker::Company.catch_phrase");
	}
	
	public static String getName() {
		return (String) eval("Faker::Company.name");
	}
	
	public static String getSuffix() {
		return (String) eval("Faker::Company.suffix");
	}	
	
}
