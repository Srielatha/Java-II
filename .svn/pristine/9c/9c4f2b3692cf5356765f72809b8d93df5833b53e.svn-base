package com.jnit.generics.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

//Set -> not an ordered collection, it doesn't allow duplicates
//HashSet -> LinkedHashSet((LinkedList + HashSet)it maintains insertion order)
//TreeSet impls SortedSet,NavigableSet -> Sorted order(doesn't use hashcode or equals method)
//Treeset doesn't allow null elements
public class SetMain {

	public static void main(String[] args) {
		Set<String>colors = new HashSet<>();
		colors.add("red");
		colors.add("blue");
		colors.add("red");
		System.out.println(colors.size());
		for (String color : colors){
			System.out.println(color);
		}
		//hashcode and equals implementation to identify duplicates
		Student s1 = new Student("John","Lewisville");
		Student s2 = new Student("John","Coppell");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Set<Student>students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
		
		for(Student s : students){
			System.out.println(s);
		}
		
        //Comparable interface and CompareTo method   
		Set<String>colorsSet = new TreeSet<>();
		colorsSet.add("red");
		colorsSet.add("blue");
		colorsSet.add("green");
		colorsSet.add("red");
		
		for(String s : colorsSet){
			System.out.println(s);
		}
		//lexicographic comparison
		Set<Employee>employeesSet = new TreeSet<>(Collections.reverseOrder());
		Employee e1 = new Employee("abc1", "John", "Lewisville");
		Employee e2 = new Employee("abc123", "Mike", "Denton");
		Employee e3 = new Employee("bbc11", "Mike", "Coppell");
		Employee e4 = new Employee("aabc11", "John", "Bradburry");
		Employee e5 = new Employee("aabc11", "John", "Albany");
		Employee e6 = new Employee("aabc11", "John", "Albany");
		employeesSet.add(e1);
		employeesSet.add(e2);
		employeesSet.add(e3);
		employeesSet.add(e4);
		employeesSet.add(e5);
		employeesSet.add(e6);
		System.out.println(employeesSet.size());
		
		for(Employee e : employeesSet){
			System.out.println(e);
		}
		//functional interface - only one abstract method
//		Comparator<Employee>comparator = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getEmpId().compareTo(o2.getEmpId());
//			}
//		};
		Comparator<Employee>comparator1 = (o1,o2) -> o1.getEmpId().compareTo(o2.getEmpId());
		Set<Employee>employeesSet1 = new TreeSet<>((o1,o2) -> o1.getEmpId().compareTo(o2.getEmpId()));
		employeesSet1.add(e1);
		employeesSet1.add(e2);
		employeesSet1.add(e3);
		employeesSet1.add(e4);
		employeesSet1.add(e5);
		employeesSet1.add(e6);
		//employeesSet1.add(null);
		System.out.println(employeesSet1.size());
		
		for(Employee e : employeesSet1){
			System.out.println(e);
		}
		
		//NavigableSet(ceiling, floor, higher, lower, pollfirst, polllast)
		NavigableSet<Integer>navset1 = new TreeSet<>();
		navset1.add(1);
		navset1.add(2);
		//navset1.add(3);
		//navset1.add(4);
		navset1.add(5);
		
		System.out.println(navset1.ceiling(3));//>= 3
		System.out.println(navset1.floor(3));//<= 3
		System.out.println(navset1.higher(3));//> 4
		System.out.println(navset1.lower(3));//< 2
		//[ONE, On, One, one]
		NavigableSet<String>navset2 = new TreeSet<>();
		navset2.add("ONE");
		navset2.add("one");
		//navset2.add("On");
		navset2.add("One");
		//for (String string : navset2) {
			System.out.println(navset2);
		//}
		System.out.println(navset2.ceiling("On"));//>= 
		System.out.println(navset2.floor("On"));//<= 
		System.out.println(navset2.higher("On"));//> 
		System.out.println(navset2.lower("On"));//< 
		navset2.pollFirst();
		navset2.pollLast();
		System.out.println(navset2);
		
		
		
		
		

		
		

		
	}

}
