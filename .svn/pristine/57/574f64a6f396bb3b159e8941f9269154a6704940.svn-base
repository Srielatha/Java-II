package com.jnit.streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//use parallel stream for independent/state less operations
//use concurrent collections when working with parallel streams for thread safety
public class ParallelStreamMain {

	public static void main(String[] args) {
		//Two ways to create parallel stream
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.parallel().forEach(System.out::println);
		System.out.println();
		List<Integer>intList = Arrays.asList(1,2,3,4,5);
		intList.parallelStream().sorted().forEach(System.out::println);
		System.out.println();
		intList.parallelStream().forEachOrdered(System.out::println);
		
		//findAny and findfirst
		System.out.println("FindAny = "+intList.parallelStream().findAny().get());
		//findFirst() works same for parallel and sequential streams
		System.out.println("FindFirst = "+intList.parallelStream().findFirst().get());
		System.out.println("Skip------");
		intList.parallelStream().skip(2).forEach(System.out::println);
		intList.stream().skip(2).forEach(System.out::println);
		System.out.println("Limit------");
		intList.parallelStream().limit(2).forEach(System.out::println);
		intList.stream().limit(2).forEach(System.out::println);
		
		
		
		Arrays.asList("jackal","kangaroo","lemur")
		.parallelStream()
		.map(s -> s.toUpperCase())
		.forEach(System.out::println);
		
		//create unordered streams
		Arrays.asList(1,2,3,4,5,6).stream().unordered();
		//unordered parallel stream
		Arrays.asList(1,2,3,4,5,6).stream().unordered().parallel();
		
		//using parallel streams with reduce and collect
		//non associative accumulator operation
		//change it to a1+a2 then it becomes associative operation
		// 1+(2-3) , (1-2)-3
		int val = Arrays.asList(1,2,3,4,5,6).parallelStream().reduce((a1,a2) -> a1-a2).get();
		System.out.println(val);
		//reduce method rules
		//The identity must be defined such that for all elements in the stream u ,
		//combiner.apply(identity, u) is equal to u .
		//The accumulator operator op must be associative and stateless such that (a op b) op c
		//is equal to a op (b op c) .
		//The combiner operator must also be associative and stateless and compatible with the
		//identity, such that for all u and t combiner.apply(u,accumulator.apply(identity,t))
		//is equal to accumulator.apply(u,t) .
		System.out.println(Arrays.asList("w","o","l","f")
				.parallelStream()
				.reduce("",String::concat));
		
		//Collect
		Stream<String> s = Stream.of("w", "o", "l", "f").parallel();
		Set<String> set = s.collect(Collectors.toSet());		
		System.out.println(set); // [f, w, l, o]
		//collecting to ordered data structures will be slow with parallel
		System.out.println(Stream.of("w", "o", "l", "f").parallel().collect(Collectors.toList()));
		
		//collect method rules with parallel streams
		//The stream is parallel.
		//The parameter of the collect operation has the Collector.Characteristics.CONCURRENT
		//characteristic.
		//Either the stream is unordered, or the collector has the characteristic
		//Collector.Characteristics.UNORDERED.
		
		Stream<String> animals = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, String> map = animals.collect(
				Collectors.toConcurrentMap(String::length, k -> k,
						(s1, s2) -> s1 + "," + s2));
		System.out.println(map); // {5=lions,bears, 6=tigers}
		System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
		
		Stream<String> animals1 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, List<String>> map1 = animals1.collect(
					Collectors.groupingByConcurrent(String::length));
		System.out.println(map1); // {5=[lions, bears], 6=[tigers]}
	}

}
