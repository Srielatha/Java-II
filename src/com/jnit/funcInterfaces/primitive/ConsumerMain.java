package com.jnit.funcInterfaces.primitive;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerMain {

	public static void main(String[] args) {
		Consumer<String> consumer = (a) -> System.out.println(a);
		consumer.accept("hello");
		//int consumer
		IntConsumer intConsumer = (a) -> System.out.println(a+1);
		intConsumer.accept(10);
		//Long Consumer
		LongConsumer longConsumer = (a) -> System.out.println(a+10);
		longConsumer.accept(20);
		//Double Consumer
		DoubleConsumer doubleConsumer = System.out::println;
		doubleConsumer.accept(12.34);
		//two params string and int
		ObjIntConsumer<String>x = (a1,a2) -> System.out.println(Integer.parseInt(a1)+a2);
		x.accept("10",20);
				
		
	}

}
