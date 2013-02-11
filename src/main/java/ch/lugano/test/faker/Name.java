package ch.lugano.test.faker;

/**
 * 
 * first_name
 * last_name
 * name
 * prefix
 * suffix
 * title
 * 
 * @author lsimone
 *
 */
public class Name extends Faker {

	public static String getFirstName() {
		return (String) eval("Faker::Name.first_name");
	}	
	
	public static String getLastName() {
		return (String) eval("Faker::Name.last_name");
	}
	
	public static String getName() {
		return (String) eval("Faker::Name.name");
	}
	
	public static String getPrefix() {
		return (String) eval("Faker::Name.prefix");
	}	

	public static String getSuffix() {
		return (String) eval("Faker::Name.suffix");
	}
	
	public static String getTitle() {
		return (String) eval("Faker::Name.title");
	}
	
}
