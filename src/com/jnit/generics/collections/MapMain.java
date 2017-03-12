package com.jnit.generics.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

//Map(I)
//HashMap implements Map
//LinkedHashMap extends HashMap
//TreeMap
//HashTable
//LinkedHashTable
//HashMap -> an array(each location of the array is a singley linked list)
//put -> gets the hashcode of the key -> hash function(hashcode) -> returns an integer
//which is the index inside the array
//same hashcode but equals method say they are different ->hash collision
//LinkedHashMap -> it maintains insertion order
//TreeMap -> it maintains sorted order -> compareTo
//HashTable -> thread safe,null keys or null values
//LinkedHashTable -> maintains insertion order
public class MapMain {

	public static void main(String[] args) {
		//key,value
		//doesn't allow duplicate keys
		//size 16
		//duplicate key-value pair, map prevents the duplicate key but will take the latest value
		//no insertion order
		//how our map identifies duplicates ??
		Map<String,Integer>map = new HashMap<>();
		map.put("Ram", 10);
		map.put("Ravi", 10);
		map.put("Raja", 10);
		map.put("Rani", 10);
		map.put("Ram", 8);
		System.out.println(map.size());
		System.out.println(map);
		//size,clear
		//hashcode and equals implementation
		Student s1 = new Student("John","Lewisville");
		s1.setState("NY");
		Student s2 = new Student("John","Coppell");
		s2.setState("NJ");
		Student s3 = new Student("John","Irving");
		s3.setState("TX");
		Map<Student, Integer>studentAddressMap = new HashMap<>();
		studentAddressMap.put(s1, 1);
		studentAddressMap.put(s2, 2);
		studentAddressMap.put(s3, 3);
		//{
			//Student [name=John, city=Coppell, state=NJ]=3, 
			//Student [name=John, city=Lewisville, state=NY]=1
		//}
		System.out.println(studentAddressMap);
		System.out.println(studentAddressMap.size());
		//get a value by passing a key
		int x = studentAddressMap.get(s1);
		
		Map<Student, List<Integer>>studentAddressMaps = new HashMap<>();
		List<Integer>intlist1 = new ArrayList<>();
		intlist1.add(1);
		studentAddressMaps.put(s1, intlist1);
		studentAddressMaps.get(s1).add(2);
		System.out.println(studentAddressMaps);
		studentAddressMaps.remove(s1);
		System.out.println(studentAddressMaps);
		//An entry is a key+value
		//map is set of entries
		for(Map.Entry<Student, Integer>entry: studentAddressMap.entrySet()){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Map<String,String>tmap = new TreeMap<>();
		//tmap.put(null, "hello");
		BiConsumer<Student,Integer>bc = new BiConsumer<Student,Integer>() {

			@Override
			public void accept(Student t, Integer u) {
				System.out.println(t);
				System.out.println(u);
			}
			
		};
		
		studentAddressMap.forEach(bc);
		studentAddressMap.forEach((t,u) ->{
			System.out.println(t);
			System.out.println(u);
		});
		
		
	}

}
