package ch.lugano.test.faker;

/**
 * Avaible methods for Internet 
 * 
 * domain_name
 * domain_suffix
 * domain_word
 * email(name = nil)
 * fix_umlauts(string)
 * free_email(name = nil)
 * ip_v4_address
 * ip_v6_address
 * safe_email(name = nil)
 * url
 * user_name(name = nil)
 * 
 * @author lsimone
 *
 */
public class Internet extends Faker {

	public static String getDomainName() {
		return (String) eval("Faker::Internet.domain_name");
	}

	public static String getDomainSuffix() {
		return (String) eval("Faker::Internet.domain_suffix");
	}

	public static String getDomainWord() {
		return (String) eval("Faker::Internet.domain_word");
	}

	public static String getEmail() {
		return (String) eval("Faker::Internet.email");
	}

	public static String getFreeEmail() {
		return (String) eval("Faker::Internet.free_email");
	}

	public static String getIPv4Address() {
		return (String) eval("Faker::Internet.ip_v4_address");
	}

	public static String getIPv6Address() {
		return (String) eval("Faker::Internet.ip_v6_address");
	}

	public static String getURL() {
		return (String) eval("Faker::Internet.url");
	}

	public static String getUsername() {
		return (String) eval("Faker::Internet.user_name");
	}

}
