package com.jnit.funcInterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

//BiConsumer -> void accept(T t, U u)
public class BiConsumerMain {

	public static void main(String[] args) {
		BiConsumer<String, String> sbiconsumer = (s1,s2)->{System.out.println(s1);System.out.println(s2);};
		sbiconsumer.accept("hello", "world");
		
		Map<String,Integer>map = new HashMap<>();
		map.put("NJ", 1);
		map.put("NY", 2);
		BiConsumer<String,Integer>mc = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				map.put(t, u);
			}
		};
		BiConsumer<String, Integer> mconsumer = (k,v)->map.put(k, v);
		mconsumer.accept("CT", 3);
		map.forEach((k,v)-> System.out.println(k+v));

	}

}
