package com.jnit.assertions;

public class ClassLevelInvariant {

	public static void main(String[] args) {

	}
	

}

class Rectangle{
	private int height,width;

	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public int getArea(){
		assert isValid() : "Not a valid rectangle length and width";
		return this.height * this.width;
	}
	
	public boolean isValid(){
		return this.height >0 && this.width > 0;
	}
	
	
	
	
}
