package ch.lugano.test.faker;

/**
 * Avaible methods for Address
 * <ul>
 * <li>building_number
 * <li>city
 * <li>city_prefix
 * <li>city_suffix
 * <li>country
 * <li>latitude
 * <li>longitude
 * <li>secondary_address
 * <li>state
 * <li>state_abbr
 * <li>street_address(include_secondary = false)
 * <li>street_name
 * <li>street_suffix
 * <li>time_zone
 * <li>zip_code (also: zip, postcode)
 * </ul>
 * @author lsimone
 *
 */

public class Address extends Faker {
	
	public static String getBuildingNumber() {
		return (String) eval("Faker::Address.building_number");
	}
	
	public static String getCity() {
		return (String) eval("Faker::Address.city");
	}
	
	public static String getCityPrefix() {
		return (String) eval("Faker::Address.city_prefix");
	}
	
	public static String getCitySuffix() {
		return (String) eval("Faker::Address.city_suffix");
	}
	
	public static String getCountry() {
		return (String) eval("Faker::Address.country");
	}
	
	public static String getLatitude() {
		return (String) eval("Faker::Address.latitude");
	}
	
	public static String getLongitute() {
		return (String) eval("Faker::Address.longitude");
	}
	
	public static String getSecondaryAddress() {
		return (String) eval("Faker::Address.secondary_address");
	}
	
	public static String getState() {
		return (String) eval("Faker::Address.state");
	}
	
	public static String getStateAbbr() {
		return (String) eval("Faker::Address.state_abbr");
	}
	
	public static String getStreetAddress(boolean includeSecondary) {
		return (String) eval(String.format("Faker::Address.street_address(%s)", includeSecondary));
	}
	
	public static String getStreetName() {
		return (String) eval("Faker::Address.street_name");
	}
	
	public static String getStreetSuffix() {
		return (String) eval("Faker::Address.street_suffix");
	}
	
	/*
	public static String getTimeZone() {
		return (String) eval("Faker::Address.time_zone");
	}
	*/
	
	public static String getZipCode() {
		return (String) eval("Faker::Address.zip_code");
	}
	
}
