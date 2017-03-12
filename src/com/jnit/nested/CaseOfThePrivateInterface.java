package com.jnit.nested;

import java.util.function.Predicate;

import com.jnit.instance.Student;

//local classes -> inside a method
public class CaseOfThePrivateInterface {
	private int x = 20;
	private int length = 5;
	
	private interface Secret {
		public void shh();
	}

	class DontTell implements Secret {

		public void shh() {
			
		}

	}
	
	public void calculate(final int breadth) {
		final int width = 20;
		//breadth = 40;
		class Inner implements Secret{
			public void multiply() {
				System.out.println(length * width * breadth);
			}

			@Override
			public void shh() {
				
			}
		}
		Inner inner = new Inner();
		inner.multiply();

	}
	
	void test(int y){
		
		Secret secret = new Secret(){
			static final int r = 30;
			@Override
			public void shh() {
				System.out.println(x);
				System.out.println(y);
			}			
		};
	}
	
	void test(Secret s){
		
	}
	void callTest(){

		Secret s =new Secret(){
			@Override
			public void shh() {
			}			
		};
		
		test(s);
				
		test(()-> System.out.println("hello"));
	}
	public static void main(String[] args) {
	
	}
}
