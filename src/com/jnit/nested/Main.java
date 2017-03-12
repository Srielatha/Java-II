package com.jnit.nested;
//Nested class -> a class inside another class
//Inner classes, static nested classes
//Inner class, 
//Anonymous inner class(abstract, interfaces) and 
//local inner class(inside methods)
public class Main {
	int x = 10;
	static int y = 10;

	//can not have static variables/static methods
	//final static variables are allowed
	public class Inner{
		public void print(){
			System.out.println("Welcome to inner class");
		}
	}
	//what a regular class can have
	//static -> static
	public static class StaticNested{
		static void print(){
			System.out.println("Static print");
		}
		
		void printer(){
			System.out.println(y);
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Inner i = m.new Inner();
		i.print();
		StaticNested s = new StaticNested();
		s.print();
		//Main.StaticNested.print();
		
	}

}
