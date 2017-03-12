package com.jnit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		//infinite streams
		//Stream.iterate(1, n -> n + 2).forEach(a -> System.out.println(a));
		//Stream.generate(Math::random).sorted().forEach(System.out::println);
		
		//data flow in the pipeline
		List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
		list.stream()
		.filter(n -> n.length() == 4)
		.sorted()
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("----------");
		Stream<String>names = Stream.of("Elsa");
		names.filter(n -> n.length() == 4)
		.sorted()
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("----------");
		
		Stream.generate(() -> "Elsa")
		.filter(n -> n.length() == 4)
		//.sorted()
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println();
		
		Stream.generate(() -> "Elsa")
		.filter(n -> n.length() == 4)
		.limit(2)
		.sorted()
		.forEach(System.out::println);

		System.out.println("After filter your limit waits to receive the data and it never comes");
		
//		Stream.generate(() -> " Hello Appi")
//		.filter(n -> n.length() == 4)
//		.limit(2)
//		.sorted()
//		.forEach(System.out::println);
		
		Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
		 
		infinite.limit(5)
		.peek(System.out::print)
		.filter(x -> x % 2 == 1)
		.forEach(System.out::print);
		System.out.println();
		
		Stream<Integer> infinite1 = Stream.iterate(1, x -> x + 1);
		 infinite1.filter(x -> x % 2 == 1)
		.limit(5)
		.forEach(System.out::print); // 13579
		System.out.println();
		
		Stream<Integer> infinite2 = Stream.iterate(1, x -> x + 1);
		infinite2.filter(x -> x % 2 == 1)
		.peek(a -> System.out.print(a))
		.limit(5)
		.forEach(System.out::print);

	}

}
