package com.jnit.streams.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluation {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		
		Stream<String>colorStream =colors.stream();
		colors.add("pink");
		System.out.println(colorStream.count());//streams are lazily evaluated
	}

}
