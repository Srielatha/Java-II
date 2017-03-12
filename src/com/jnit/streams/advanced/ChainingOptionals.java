package com.jnit.streams.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ChainingOptionals {

	static Optional<Integer> calculator(String s){
		return Optional.of(s).map(a -> a.length());
	}
	public static void main(String[] args) {
		List<Integer>arrList = Arrays.asList(12345,345,3456,6789);
		Optional<List<Integer>>intOptional = Optional.of(arrList);
		
		intOptional.map(a -> a+"")
		.filter(a -> a.length() > 3)
		.ifPresent(a -> System.out.println(a));
		
		String s = "hello";
		Optional<Integer>loptional = Optional.of(s).map(a -> a.length());
		Optional<Integer>loptional1 = Optional.of(s).map(String::length);
		System.out.println(loptional.get());
		System.out.println(loptional1.get());
		
		int length1 = Optional.of("hello world").map((a)-> ChainingOptionals.calculator(a)).get().get();
		System.out.println(length1);
		int length2 = Optional.of("hello world").map(ChainingOptionals:: calculator).get().get();
		System.out.println(length2);
		int length3 = Optional.of("hello world buddy").flatMap(ChainingOptionals:: calculator).get();
		System.out.println(length3);
	}

}
