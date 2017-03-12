package com.jnit.funcInterfaces.primitive;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class ToFunctionMain {

	public static void main(String[] args) {
		Function<Integer,String>f = (i) -> i.toString();
		System.out.println(f.apply(10));
		
		ToIntFunction<String>ti = (i) -> Integer.parseInt(i);
		System.out.println(ti.applyAsInt("14"));
		
		ToDoubleFunction<Employee> td = (emp) -> emp.salary;
		Employee e = new Employee();
		e.salary = 10000.67;
		System.out.println(td.applyAsDouble(e));
	}

}

class Employee {
	double salary;
}
