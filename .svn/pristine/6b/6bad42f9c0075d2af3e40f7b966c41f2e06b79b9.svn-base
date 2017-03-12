package com.jnit.funcInterfaces.primitive;

import java.util.function.Function;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class D1toD2FunctionMain {

	public static void main(String[] args) {
		Function<String,String> f = (s) -> s.substring(2);
		System.out.println(f.apply("hello"));
		
		LongToIntFunction f1 = (l) -> (int)l;
		System.out.println(f1.applyAsInt(10L));
		
		LongToDoubleFunction f2 = (l) -> l;
		System.out.println(f2.applyAsDouble(10));
	}

}
