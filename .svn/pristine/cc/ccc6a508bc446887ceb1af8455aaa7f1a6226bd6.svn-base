package com.jnit.generics;

import java.util.ArrayList;
import java.util.List;

public class LegacyCode {
	
	public static void main(String[] args) {
		List<String>someList = new ArrayList<>();
		someList.add("hello");
		addSomeThingToList(someList);
		System.out.println(someList);
		List rawList = new ArrayList();
		rawList.add(new StringBuffer("hello"));
		doSomething(rawList);
	}
	
	public static void addSomeThingToList(List list){
		list.add(100);
	}
	
	public static <T>void doSomething(List<T>someList){
		for (T string : someList) {
			System.out.println(string);
		}
	}
}
