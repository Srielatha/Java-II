package com.jnit.resourceebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.jnit.resourceebundle.Zoo", new Locale("en", "US"));
		String val = rb.getString("hello");
		System.out.println(val);
		rb.keySet().forEach(k -> System.out.println(rb.getString(k)));
		
		Properties properties = new Properties();
		rb.keySet().forEach(k -> properties.put(k, rb.getString(k)));
		System.out.println(properties.getProperty("hello"));
		System.out.println(properties.getProperty("bye", "Bye appi"));
		
		String msg = rb.getString("helloByName");
		String formatted = MessageFormat.format(msg, "Appi");
		System.out.println(formatted);
	}

}
