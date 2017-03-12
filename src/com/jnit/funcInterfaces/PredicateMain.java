package com.jnit.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Predicate-> boolean test(T t)
public class PredicateMain {

	public static void main(String[] args) {
		Predicate<String>p = (t) ->t.startsWith("he");
		System.out.println(p.test("hello appi"));
		System.out.println(p.test("bye appi"));
		System.out.println();
		Predicate<List<String>>p1 = (w)->w.contains("NY");
		System.out.println(p1.test(Arrays.asList("NY","NJ","CT")));
		System.out.println(p1.test(Arrays.asList("NJ","CT")));
		
	}
}
