package com.jnit.functional;

//() -> {statments}
public class LamdaMain {

	public static void main(String[] args) {
		TestI t = (c, d) -> c+d;
		TestI1 t1 = () -> true;
		TestI1 t2 = () ->{int a = 10; return true;};
		
		TestI2 t3 = (c, d) -> c+d;
		dosomething((c,d) -> c+d);//deferred execution
	}
	
	public static void dosomething(TestI2 i2){
		
	}

}
