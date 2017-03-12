package com.jnit.generics.collections;

public class Student implements Comparable<Student>{

	private String name;
	private String city;
	private String state;
	
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	//overrides equals and hashcode
	
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(! (obj instanceof Student)){
			return false;
		}
		Student s = (Student)obj;
		return this.getName().equals(s.getName()) && this.getCity().equals(s.getCity());
	}
	//hashcode method gets called first to check if two objects has the same hashcode
	//if hashcode is different then hashset treats the objects as distinct
	//if hashcode is same then it calls equals method to compare the contents
	@Override
	public int hashCode(){
		return this.name.hashCode() + this.city.hashCode() * 7;
		//return 1;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", state=" + state + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}

	
	

}
