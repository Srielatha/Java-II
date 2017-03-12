package com.jnit.generics.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Collection - I
//List extends Collection -
//ArrayList, LinkedList, Vector(thread safe, 2 times of its current size)
//Set extends Collection
//Queue extends Collection
//Map
public class ListMain {
	//starting element is at index 0
	//ordered collection
	// accepts duplicates
	// we are doing more retrievals
	// re-indexing happens when we perform removals
	//add,remove,contains,clear,set,get(i),size()
	public static void main(String[] args) {
		//LinkedList -> faster in modifications(insertions and deletions)
		//Node based data structure
		//each node contains data and ponter to previous node and pointer to next node
		
		List<String>stringsList = new LinkedList<>();
		stringsList.add("red");
		stringsList.add("green");
		stringsList.add("blue");
//		Predicate<String>pd = new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				return t.startsWith("b");
//			}
//			
//		};
		stringsList.removeIf(t -> t.startsWith("b"));
		
		//removefirst, removelast, add first, add last
		LinkedList<String>stringsList1 = new LinkedList<>();
		
		List<Short>shortList = new ArrayList<>(5);
		shortList.add((short)1);
		
		Collections.sort(stringsList);
		List<Student>students = new ArrayList<>();
		Collections.sort(students);
		Collections.sort(students, (s1,s2) -> s1.getCity().compareTo(s2.getCity()));
		//looping through collections
		//forEach
		//Consumer FI
		Consumer<String>consumer1 = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		stringsList.forEach(consumer1);
		stringsList.forEach(t -> System.out.println(t));
		
	}

}
