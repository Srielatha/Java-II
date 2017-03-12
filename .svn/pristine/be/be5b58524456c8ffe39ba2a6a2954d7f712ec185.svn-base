package com.jnit.designpatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMain {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<>();
		map.put("Ram",1);
		map.put("Ravi",2);
		map.put("Sammer", null);
		BiFunction<Integer, Integer, Integer>func = (v1,v2)-> v1+v2;
		System.out.println(map);
		map.merge("Ram", 3, func);
		map.merge("Raju", 10, func);
		map.merge("Sameer",5, func);
		System.out.println(map);
		
		

	}

}
