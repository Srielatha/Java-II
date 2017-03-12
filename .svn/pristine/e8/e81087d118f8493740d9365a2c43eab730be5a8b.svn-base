package com.jnit.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

//BiPredicate-> boolean test(T t, U u)
public class BiPredicateMain {

	public static void main(String[] args) {
		BiPredicate<String, String>bp = (t1,t2)->t1.endsWith(t2);
		System.out.println(bp.test("hello", "lo"));
		
		BiPredicate<List<String>, String>bp1 = (t1,t2)->t1.contains(t2);
		System.out.println(bp1.test(Arrays.asList("NY","NJ"), "NY"));		
	}

}
