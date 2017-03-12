package com.jnit.funcInterfaces;

import java.util.function.UnaryOperator;

//UnaryOperator<T>-> T apply(T t)
public class UnaryOperationMain {

	public static void main(String[] args) {
		UnaryOperator<String>u1 = (s)->s.toUpperCase();
		System.out.println(u1.apply("hello"));
		
		UnaryOperator<Employee>uo = (emp)->{
			if(emp.city.equals("Edison")){
				emp.state="NJ";
			}
			return emp;
		};
		
		Employee emp = new Employee();
		emp.city="Edison";
		System.out.println(uo.apply(emp));
	}

}

class Employee{
	String city;
	String state;
	@Override
	public String toString() {
		return "Employee [city=" + city + ", state=" + state + "]";
	}
	
}
