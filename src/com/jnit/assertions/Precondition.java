package com.jnit.assertions;

public class Precondition {

	private String text;
	
	private void setText(String  text) {
		assert text != null : "Precondition: text != null";
		 
		 this.text = text;
    }
	public void test(){
		//do some code whichwill give text value
		setText(null);
	}
	public static void main(String[] args) {
		

	}

}
