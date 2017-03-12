package com.jnit.generics.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

//putIfAbsent - put when the value is null and key doesn't match with existing keys
//Merge
//Compute, 
//ComputeifPresent
//ComputeIfAbsent
//Consumer, Bi-Consumer, Bi-Function, Function -> F interfaces
public class MapJava8Main {

	public static void main(String[] args) {
		Map<String,Integer>map = new HashMap<>();
		map.put("Ram", 10);
		map.put("Ravi", 10);
		map.put("Raja", 10);
		map.put("Rani", 10);
		map.put("Tom", null);
		map.putIfAbsent("Ram", 8);
		map.putIfAbsent("Tom", 18);
		System.out.println(map);
		//Merge
		Map<String,Integer>map1 = new HashMap<>();
		map1.put("Ram", 10);
		map1.put("Ravi", 10);
		map1.put("Raja", 10);
		map1.put("Tom", null);
		//Key,value,Bifunction(value,newValue,result)
		BiFunction<Integer, Integer, Integer>bfu = new BiFunction<Integer, Integer, Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t * u;
			}
		};
		//map1.merge("Ram",4, bfu);
		//v1 is existing value
		//v2 is ur new value
		map1.merge("Ram",4, (v1,v2) -> v2);
		map1.merge("Ram",4, (v1,v2) -> v2 + v1);
		map1.merge("Tom",10, (v1,v2) -> v1 * v2);
		map1.merge("Peter",10, (v1,v2) -> v1 * v2);
		//map1.put("Ram", map1.get("Ram") * 2);
		
		System.out.println(map1);
		//map1.replaceAll((v1,v2) -> v2*10);
		
		//compute (Key,Existing value, Result data type)
		BiFunction<String, Integer, Integer>cbg = new BiFunction<String, Integer, Integer>() {
			@Override
			public Integer apply(String t, Integer u) {
				return 10 * u;
			}
		};
		
		map1.compute("Peter",cbg);
		System.out.println(map1);
		//compute if present
		
		map1.computeIfPresent("Tom",cbg);
		Function<String,Integer>f = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return 10;
			}
		};
		System.out.println(map1);
		map1.computeIfAbsent("Peter",(t) -> 10);
		System.out.println(map1);
		
	}

}
