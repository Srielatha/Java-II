package com.jnit.streams.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//toList, toSet,toCollection(Supplier)
//toMap(Function key, Function value)
//toMap(Function k, Function v,BinaryOperator m) - resolve duplicate keys
//toMap(Function k, Function v,BinaryOperator m, Supplier s) - collect in desired map like treemap
public class CollectingResults {

	public static void main(String[] args) {
		//Collectors joining
		Stream<String>chars = Stream.of("a","p","p","l","e");
		String joined = chars.collect(Collectors.joining());
		System.out.println(joined);

		Stream<String>animals0 = Stream.of("lions", "tigers", "bears");
		Double avgLength = animals0.collect(Collectors.averagingInt(s -> s.length()));
		System.out.println(avgLength);

		
		Stream<String> animals = Stream.of("lions", "tigers", "bears");
		//string to length map
		Map<String,Integer>map = animals.collect(Collectors.toMap((a)-> a, (a) -> a.length()));
		System.out.println(map);
		//length to string map with binary operator addressing duplicate keys
		Stream<String> animals1 = Stream.of("lions", "tigers", "bears");
		Map<Integer,String>map1 = animals1.collect(Collectors.toMap((a)-> a.length(), (a) -> a, (k1,k2)->k1+","+k2));
		System.out.println(map1);
		System.out.println(map1.getClass());
		
		Stream<String> animals2 = Stream.of("lions", "tigers", "bears");
		Map<Integer,String>map2 = animals2.collect(Collectors.toMap((a)-> a.length(), (a) -> a, (k1,k2)->k1+","+k2,TreeMap::new));
		System.out.println(map2);
		System.out.println(map2.getClass());
		
		//use grouping by with length and List<String>
		Stream<String> animals3 = Stream.of("lions", "tigers", "bears");
		Map<Integer,List<String>>map3 = animals3.collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(map3);

		//use grouping with length and set
		Stream<String> animals4 = Stream.of("lions", "tigers", "bears","lions");
		Map<Integer,Set<String>>map4 = animals4.collect(Collectors.groupingBy(s -> s.length(), Collectors.toSet()));
		System.out.println(map4);
		System.out.println(map4.getClass());
		//collecting to tree map
		Stream<String> animals5 = Stream.of("lions", "tigers", "bears","lions");
		Map<Integer,Set<String>>map5 = animals5.collect(Collectors.groupingBy(s -> s.length(),TreeMap::new, Collectors.toSet()));
		System.out.println(map5);
		System.out.println(map5.getClass());
		//Collect the count
		Stream<String> animals6 = Stream.of("lions", "tigers", "bears","lions");
		Map<Integer,Long>map6 = animals6.collect(Collectors.groupingBy(s -> s.length(), Collectors.counting()));
		System.out.println(map6);
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Map<Boolean, List<Integer>>evenOddMap = intList.stream().collect(Collectors.partitioningBy(x -> x%2 == 0, Collectors.toList()));
		System.out.println(evenOddMap);
		Map<Boolean, Integer> result = intList.stream().collect(Collectors.partitioningBy(x -> x%2 == 0, Collectors.summingInt(Integer::intValue)));
		System.out.println(result);
		
		Customer c1 = new Customer("Ravi", "Parlin");
		Customer c2 = new Customer("Bob", "Jersey City");
		Customer c3 = new Customer("Ram", "Jersey City");
		Customer c4 = new Customer("Joe", "Edison");

		List<Customer> custList = new ArrayList<>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);

		//group customers by city
		Map<String, List<Customer>>customerCityMap = custList.stream().collect( Collectors.groupingBy( cust -> cust.getCity()));
		Map<String, List<Customer>>customerCityMap1 = custList.stream().collect( Collectors.groupingBy( Customer :: getCity));
        System.out.println("Grouped by city map");
		System.out.println(customerCityMap);
		System.out.println(customerCityMap1);
		
		Map<String, Set<Customer>>customerCityMapSet = custList.stream().collect(Collectors.groupingBy( cust -> cust.getCity(), Collectors.toSet()));
		Map<String, Set<Customer>>customerCityMapSet1 = custList.stream().collect(Collectors.groupingBy( Customer :: getCity, Collectors.toSet()));

		System.out.println(customerCityMapSet);
		System.out.println(customerCityMapSet1);
		//filter jersey city customers
		List<Customer>jerseyCityCustomers = custList.stream().filter(cust -> cust.getCity().equals("Jersey City")).collect(Collectors.toList());
		System.out.println(jerseyCityCustomers);
		//{5=Optional[b], 6=Optional[t]}
		Stream<String> animals7 = Stream.of("lions", "tigers", "bears","lions");
		Map<Integer, Optional<Character>> outmap = animals7.collect(
				Collectors.groupingBy(
				String::length,
				Collectors.mapping(s -> s.charAt(0),
				Collectors.minBy(Comparator.naturalOrder()))));
				System.out.println(map);
		System.out.println(outmap);

	}

}
