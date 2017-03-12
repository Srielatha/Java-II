package com.jnit.funcInterfaces;

import java.util.Optional;

//90,90 -> 90
// ->0
//orElse(T t),orElseThrow(Supplier<T>t )//throw an exception
//orElseGet(Supplier<T>t)
public class OptionalMain {

	public static Integer average(int... marks){
		if(marks.length == 0){
			return null;
		}
		int total = 0;
		for(int s : marks){
			total +=s;
		}
		return total/marks.length;
	}

	public static Optional<Integer> averageWithOptional(int... marks){
		if(marks.length == 0){
			return Optional.empty();
		}
		int total = 0;
		for(int s : marks){
			total +=s;
		}
		return Optional.of(total/marks.length);
	}

	public static void main(String[] args) {
		int[] x = {90,90};
		int[] x1 = {};
		Optional<Integer>o = averageWithOptional(x);
		if(o.isPresent()){
			Integer avg = o.get();
			System.out.println(avg);
		}
		Optional<Integer>o1 = averageWithOptional(x1);
		if(o1.isPresent()){
			Integer avg = o1.get();
		}
		
		o1.ifPresent((t) -> System.out.println(t));
		
		o1.orElse(0);
		o1.orElseGet(()-> 0);
		o1.orElseThrow(()-> {throw new IllegalStateException("somehting went wrong");});
	
	}

}
