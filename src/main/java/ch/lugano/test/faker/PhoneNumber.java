package ch.lugano.test.faker;

/**
 * 
 * cell_phone
 * phone_number
 * @author lsimone
 *
 */
public class PhoneNumber extends Faker {

	public static String getCellPhone() {
		return (String) eval("Faker::PhoneNumber.cell_phone");
	}
	
	public static String getPhoneNumber() {
		return (String) eval("Faker::PhoneNumber.phone_number");
	}
	
}
