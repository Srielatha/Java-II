package com.jnit.funcInterfaces;

import java.util.function.Function;

//Function<T, R> - R apply(T t){}
public class FunctionMain {

	public static void main(String[] args) {
		Function<String, String> f = (s1)-> s1+" City ";
		String result = f.apply("NY");
		System.out.println(result);
		
		Function<String,Integer> f1 = (s1)-> Integer.parseInt(s1);
		System.out.println(f1.apply("1"));
		
		Function<String,Integer> f3 = (s1)-> s1.length();
		System.out.println(f3.apply("hello"));
		
		
	}

}
