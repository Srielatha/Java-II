package com.jnit.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import javax.sound.sampled.BooleanControl;

//OptionalInt,OptionalDouble,OptionalLong
public class OptionalPrimitive {

	public static void main(String[] args) {
		//avg - OptionalDouble for int,long and double
		//max,min -> OptionalInt,OptionalLong,OptionDouble
		//sum -> does not
		IntStream.of(1,2,3).sum();
		OptionalDouble odouble = IntStream.of(1,2,3,4).average();
		odouble.getAsDouble();
		odouble.ifPresent((a)->System.out.println(a));
		odouble.orElseGet(() -> 1.2);
		
		OptionalInt oint = IntStream.of(1,2,3,4,5).max();
		oint.ifPresent(System.out::println);
		
		OptionalLong olong = LongStream.of(1,2,3,4,5,6,7,8).max();
		olong.ifPresent(System.out::println);
		
		
		
	}

}
