package ch.lugano.test.faker;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public abstract class Faker {
	
	static ScriptEngine jruby;
	
	static {
		
		jruby = new ScriptEngineManager().getEngineByName("jruby");

		try {
			jruby.eval("require 'faker'");
		}
		catch (ScriptException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static Object eval(String toEvaluate) {
		
		try {
			return jruby.eval(toEvaluate);
		}
		catch(Exception e) {
			System.out.println(String.format("Exception: %s", e.getMessage()));
		}
		return null;
		
	}
	
	public static String get(String what) {
		
		try {
			return (String) jruby.eval(String.format("Faker::%s", what));
		}
		catch (Exception ex) {
			return "";
		}
		
	}

	public static String get(String what, String locale) {
		
		try {
			jruby.eval(String.format("Faker::Config.locale = '%s'", locale));
			return (String) jruby.eval(String.format("Faker::%s", what));
		}
		catch (Exception ex) {
			return "";
		}
		
	}
	
}
