package com.jnit.concurrency.sync;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class SkipCollectionsMain {

	public static void main(String[] args) {
		//Concurrent Sorted Set
		Set<String>colors = new ConcurrentSkipListSet<>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.forEach(System.out::println);
		//Concurrent Sorted Map
		Map<String, Integer> foodData = new ConcurrentSkipListMap<>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		foodData.put("penguin", 2);
		
		foodData.forEach((k,v)-> System.out.println(k+""+v));

	}

}
