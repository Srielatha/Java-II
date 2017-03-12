package com.jnit.funcInterfaces;

public class Main {

	public static void main(String[] args) {
		//anonymous type and convert it to lamda
		Test t = new Test() {
			@Override
			public String testMethod(String x, String y) {
				return x+y;
			}
		};		
		Test t1 = (String x, String y) ->{return x+y;};
		Test t2 = (x,y) -> x+y;
		String x = t2.testMethod("hello", "world");
		System.out.println(x);
	}

}
