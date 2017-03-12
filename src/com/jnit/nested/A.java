package com.jnit.nested;

public class A {

	public class B{
		
		public class C{
			
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = a.new B();
		//C c = b.new C();
		A.B.C c = b.new C();
	}
}
