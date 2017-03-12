package com.jnit.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

	public static void main(String[] args) {
		Box2<String,Integer>b1 = new Box2<>();
		b1.setContents("hello");
		b1.setText(10);
		GenericMethods.print(Arrays.asList(1,2,3));
	}
	
	public static <T> void print(List<T>someList){
		for (T t : someList) {
			System.out.println(t);
		}
	}
	
	public static <T> T test(T t){
		return t;
	}

	public static <T> Box<T> testBox(T t){
		return new Box<T>();
	}

}
