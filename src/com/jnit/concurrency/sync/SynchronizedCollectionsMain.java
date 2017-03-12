package com.jnit.concurrency.sync;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//SynchronizedList, SynchronizedMap, SynchronizedSet, SynchronizedSortedMap, SynchronizeSortedSet
//SynchronizedNavigableMap and Set
//Synchornized collections lock the entire map, so using concurrent classes is better
//SynchronizedCollections do not synchronize access on any iterators -
//that you may create from the synchronized collection
//the synchronized collections also throw an exception if they are modified 
//within an iterator by a single thread.
public class SynchronizedCollectionsMain {

	public static void main(String[] args) {
		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		List<String> sColors = Collections.synchronizedList(colors);
		sColors.add("blue");

		Map<String, Integer> foodData = new HashMap<>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		foodData.put("penguin", 2);

		Map<String, Integer> sfoodData = Collections.synchronizedMap(foodData);
		sfoodData.put("peacock", 3);

		List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
		synchronized (list) {
			for (int data : list)
				System.out.print(data + " ");
		}
		
		for(String key: sfoodData.keySet())
			sfoodData.remove(key);

	}

}
