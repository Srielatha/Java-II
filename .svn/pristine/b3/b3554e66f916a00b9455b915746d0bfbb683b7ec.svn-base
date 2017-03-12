package com.jnit.functional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

//reference to a static method -> ClassName::staticMethodName
//reference to a instance method of an object -> objectRef::methodName
//reference to a constructor  -> ClassName::new
//Reference to an instance method of an arbitrary object of a particular type ClassName::methodName
public class MethodReferences {

	public static void main(String[] args) {

		// Consumer FI
		Consumer<String> consumer = (a) -> System.out.println(a);

		Consumer<String> consumerMR = System.out::println;

		List<String> colors = new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");

		colors.forEach(a -> System.out.println(a));
		colors.forEach(System.out::println);
		
		List<Person>persons = Arrays.asList(new Person(LocalDate.of(1981, 10, 11)),new Person(LocalDate.of(1982, 10, 11)),new Person(LocalDate.of(1979, 10, 11)));
		Collections.sort(persons,(p1,p2) -> p1.getBirtdate().compareTo(p2.getBirtdate()));
		Collections.sort(persons,MethodReferences::comparePersonsByAge);//reference to a static method of a class
		persons.forEach(System.out::println);
		
		MethodReferences mr = new MethodReferences();
		Collections.sort(persons, mr::comparePersons);//reference to a instance method of an object
		persons.forEach(System.out::println);
		
		//reference to a constructor
		
		
	}
	
	public static int comparePersonsByAge(Person p1, Person p2){
		return p1.getBirtdate().compareTo(p2.getBirtdate());
	}
	
	public int comparePersons(Person p1, Person p2){
		return p1.getBirtdate().compareTo(p2.getBirtdate());
	}
	

}
