package com.jnit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Intermediate Operations -> operation result will be a stream
//filter(Predicate),distinct,limit(int),skip(int),sorted(Comparator),peek(Consumer),map(Function),flatmap(Function)
public class IntermediateMain {

	public static void main(String[] args) {
		Stream<Integer>intStream = Stream.of(1,2,5,3,4,7,6,9,8,1);
		//filter
		//intStream.filter(i -> i%2 == 0).forEach(a -> System.out.println(a));
		//Set<Integer>intset = intStream.filter(i -> i%2 !=0).collect(Collectors.toSet());
		//System.out.println(intset);
		//distinct
		//intStream.distinct().forEach(a -> System.out.println(a));
		//intStream.skip(4).filter(i -> i%2==0).forEach(System.out::println);
		//intStream.filter(i -> i%2 != 0).limit(3).forEach(System.out::println);
		//Set<Integer>intset = intStream.collect( Collectors.toCollection(TreeSet::new));
		//System.out.println(intset);
		//intStream.distinct().sorted().forEach(System.out::println);
		//long x = intStream.skip(4).filter(i -> i%2==0).peek(System.out::println).count();
		//System.out.println(x);
		//Function<T,R>
		Stream<String> stream = Stream.of("hello","bye","a");
		stream.map(a -> a+"some").forEach(System.out::println);
		System.out.println();
		//flat map
		Stream<List<String>> lStreams = Stream.of(Arrays.asList("hello","bye","a"),Arrays.asList("red","blue"));
		lStreams.flatMap(y -> y.stream()).map(a -> a.toUpperCase()).forEach(System.out::println);
	}

}
