package com.jnit.nested;

public class Outer {
	private int x = 10;
	public class Inner{
		private int x = 20;
		public void printX(int x){
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
		}
	}
}
