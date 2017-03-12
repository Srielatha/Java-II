package com.jnit.funcInterfaces.primitive;

import java.util.function.BiFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;

public class ToBiFunctionMain {

	public static void main(String[] args) {
		BiFunction<String, String, String> bif = (t,u)-> t+u;
		System.out.println(bif.apply("hello", "world"));
		
		ToIntBiFunction<Integer, Integer> tib = (t,u) -> t*u;
		System.out.println(tib.applyAsInt(10, 20));
		
		ToDoubleBiFunction<Integer, Double> tdb = (t,u) -> t*u;
		System.out.println(tdb.applyAsDouble(10, 3.14));
		
	}

}
