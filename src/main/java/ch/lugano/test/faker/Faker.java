package ch.lugano.test.faker;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@SuppressWarnings("restriction")
public class Faker {
	
	private static ScriptEngine jruby;
	
	static {
		jruby = new ScriptEngineManager().getEngineByName("jruby");
	}
		
	public static String get(String wat) {
		try {
			jruby.eval("require 'faker'");
			jruby.eval("Faker::Config.locale = 'de-ch'");
			return (String) jruby.eval("Faker::" + wat);
		}
		catch (Exception ex) {
			return "";
		}
	}

	public static String get(String wat, String locale) {
		try {
			jruby.eval("require 'faker'");
			jruby.eval("Faker::Config.locale = '" + locale + "'");
			return (String) jruby.eval("Faker::" + wat);
		}
		catch (Exception ex) {
			return "";
		}
	}
	
}
