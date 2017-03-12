package com.jnit.instance;

import java.util.Arrays;
import java.util.List;

//Object ->equals(==), hashcode, toString(convert an object to a string)
//hashcode -> HashMap,HashSet,HashTable,ConcurrentHashMap
public class Student {
	private String first;
	private String last;

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
	@Override
	public String toString() {
		return "Student [first=" + first + ", last=" + last + "]";
	}
	//your equals method should obey certain properties
	//Reflexive
	//symmetric -> s1 and s2
	//trasitive -> s1,s2,s3
	//consistency ->
	//for-null references -> false

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello howdy");
		System.out.println(sb);
		Student s1 = new Student();
		s1.setFirst("John");
		s1.setLast("Michael");
		Student s2 = new Student();
		s2.setFirst("John");
		s2.setLast("Michael");

		System.out.println(s1);//com.jnit.instance.Student@15db9742
		//John Michael
		List<Integer>intList = Arrays.asList(1,2,3,4);
		System.out.println(intList);
		int[]numbers = {1,2,3,4};
		System.out.println(numbers);//[I@15db9742
		System.out.println(Arrays.toString(numbers));
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s11 = "abc";
		String s22 = "abc";
		System.out.println(s11.equals(s22));
		System.out.println(s1.equals(s1));
		System.out.println(s11.hashCode());
		System.out.println(s1.hashCode());//1855381340
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		return true;
	}

}
