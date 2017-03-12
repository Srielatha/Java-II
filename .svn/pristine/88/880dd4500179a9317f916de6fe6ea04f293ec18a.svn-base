package com.jnit.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Stream
//IntermediateOperations
//Terminal Operations - count, max,min-Comparator as input
public class TerminalMain {

	public static void main(String[] args) {
		Comparator<Integer>cmp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
			
		};
		//count
		Stream<Integer>intStream = Stream.of(1,2,1,3,4);
		//System.out.println(intStream.count());
		//min(comparator) and max(comparator)
		//System.out.println(intStream.max((x,y)-> x-y));
		//System.out.println(intStream.min((x,y)-> x-y));
		//findAny(free to select any element), findFirst
		//System.out.println(intStream.findFirst());
		//System.out.println(intStream.findAny());
		//allMatch,anyMatch,NoneMatch
		//System.out.println(intStream.allMatch((a) -> a.equals(1)));
		//System.out.println(intStream.anyMatch((a) -> a.equals(1)));
		//System.out.println(intStream.noneMatch((a) -> a.equals(7)));
		//we can not use traditional for loop on streams
		//intStream.forEach( a -> System.out.println(a));
		//intStream.forEach(System.out::println);
		
		//reduce method(identity,accumulator(BinarayOperator)),(accumulator(BO)),(identity,accumulator,combiner)
		//Integer result = intStream.reduce(2,(a,b) -> a*b);
		//System.out.println(result);		
		//Optional<Integer>inoptional = intStream.reduce((a,b)-> a*b);
		//inoptional.ifPresent(a -> System.out.println(a));
		//Optional<Integer>inoptional1 = Stream.of(1,2,3,4).reduce((a,b)-> a>b ? a:b);
		//System.out.println(inoptional1.get());
		//collect -> collect(Collectors), collect(Supplier,Biconsumer-accumulator,BiConsumer-combiner)
		Stream<Character>chracterStream = Stream.of('a','p','p','l','e');
		//Set<Character>charset = chracterStream.collect(Collectors.toSet());
		//Set<Character>charTreeSet = chracterStream.collect(Collectors.toCollection(TreeSet::new));
		//System.out.println(charTreeSet);

		//mutable objects -> collect, immutable -> reduce
		//collect(Supplier,Biconsumer-accumulator,BiConsumer-combiner)
		Supplier<StringBuilder> supplier = () -> new StringBuilder();
		BiConsumer<StringBuilder, Character>bc = (a,b)-> a.append(b);
		BiConsumer<StringBuilder, StringBuilder>bc1 = (a,b)-> a.append(b);
		StringBuilder word = chracterStream.collect(supplier, bc, bc1);
		System.out.println(word);

	}

}
