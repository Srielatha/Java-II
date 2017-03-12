package com.jnit.exceptions;

public class ABMain {

	public static void main(String[] args) {
		try(A a = new A();
			B b = new B();){//closes b then a			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
