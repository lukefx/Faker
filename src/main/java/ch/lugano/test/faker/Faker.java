package ch.lugano.test.faker;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

@SuppressWarnings("restriction")
public class Faker {
	
	private static ScriptEngine jruby;
	
	static {
		
		jruby = new ScriptEngineManager().getEngineByName("jruby");

		try {
			jruby.eval("require 'faker'");
		}
		catch (ScriptException e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	public static String get(String wat) {
		try {
			jruby.eval("Faker::Config.locale = 'de-ch'");
			return (String) jruby.eval(String.format("Faker::%s", wat));
		}
		catch (Exception ex) {
			return "";
		}
	}

	public static String get(String wat, String locale) {
		try {
			jruby.eval(String.format("Faker::Config.locale = '%s'", locale));
			return (String) jruby.eval(String.format("Faker::%s", wat));
		}
		catch (Exception ex) {
			return "";
		}
	}
	
}
