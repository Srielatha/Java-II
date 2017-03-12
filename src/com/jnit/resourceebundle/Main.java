package com.jnit.resourceebundle;

import java.util.Locale;
//Localization -> developing a program/application that supports multiple locales/regions and so on
//Internationalization -> design a program/application that is supported by localization
public class Main {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		Locale locale1 = new Locale("en");
		System.out.println(locale1);
		System.out.println(Locale.FRANCE);
		System.out.println(Locale.FRENCH);
		Locale locale2 = new Locale("hi","IN");
		System.out.println(locale2);
		//LocaleBuilder
		Locale locale3 = new Locale.Builder().setLanguage("hi").setRegion("IN").build();
		System.out.println(locale3);
		//Locale.setDefault(locale3);
		
	}

}
