package com.jnit.funcInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

//BinaryOperator<T>->T apply(T t1, T t2){}
public class BinaryOperatorMain {

	public static void main(String[] args) {
		BinaryOperator<String>bo = (t1,t2)-> t1.concat(t2);
		System.out.println(bo.apply("hello", "world"));
		
		BinaryOperator<List<Integer>> b1 = (t1,t2)->{
			t1.removeAll(t2);
			return t1;
		};
		
		List<Integer>list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		System.out.println(b1.apply(list1, Arrays.asList(1,4)));
		
		
	}

}
