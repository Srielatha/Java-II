package com.jnit.concurrency.sync;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
//CME -> can happen with single thread as well
public class ConcurrentCollections {

	public static void main(String[] args) {

		Map<String, Integer> foodData = new ConcurrentHashMap<>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for (String key : foodData.keySet())
			foodData.remove(key);
		System.out.println(foodData);
		
		ConcurrentMap<String, String>cmap = new ConcurrentHashMap<>();
		cmap.put("Mike", "Developer");
		cmap.put("Harry", "Lead");
		//Queue -offer - to add, -Poll - to remove -Peek to get the next one in queue
		Queue<String>peopleq = new ConcurrentLinkedQueue<>();
		peopleq.offer("Mike");
		peopleq.offer("Adam");
		System.out.println(peopleq.peek());
		String removedEl = peopleq.poll();
		System.out.println(removedEl);
		System.out.println(peopleq);
		
		//addFirst,addLast,RemoveFirst, RemoveLast
		Deque<String>peopledq = new ConcurrentLinkedDeque<>();
		peopledq.offer("Mike");
		peopledq.offer("Adam");
		System.out.println(peopledq.peek());
		String removedEl1 = peopledq.removeFirst();
		System.out.println(removedEl1);
		System.out.println(peopledq);
		//CopyOnWriteArrayList - iterators performing remove, set,add are not supported
		//List<String>fruits = new ArrayList<>();
		List<String>fruits = new CopyOnWriteArrayList<>();
		fruits.add("mango");
		fruits.add("Pineapple");
		fruits.add("orange");

		for(String s : fruits){
			System.out.println(s);
			fruits.add("grapes");
		}
		System.out.println(fruits.size());

		for(String s : fruits){
			//fruits.remove(s);
		}
		Iterator<String>it = fruits.iterator();
		while(it.hasNext()){
			//it.remove();//CME
		}
		System.out.println(fruits);
		//its an array based set -ordered
		// is best suited for applications in which set sizes generally stay small, read-only operations vastly outnumber mutative operations, and you need to prevent interference among threads during traversal.
		//It is thread-safe.
		//Mutative operations (add, set, remove, etc.) are expensive since they usually entail copying the entire underlying array.
		//Iterators do not support the mutative remove operation.
		//Traversal via iterators is fast and cannot encounter interference from other threads. Iterators rely on unchanging snapshots of the array at the time the iterators were constructed.
		Set<String>fruitsSet = new CopyOnWriteArraySet<>();
		
		fruitsSet.add("mango");
		fruitsSet.add("Pineapple");
		fruitsSet.add("orange");
		fruitsSet.add("mango");
		fruitsSet.stream().forEach(System.out::println);
		
		Iterator<String>it1 = fruitsSet.iterator();
		while(it1.hasNext()){
			it1.remove();//Fine np
		}
		System.out.println(fruitsSet);
		

	}

}
