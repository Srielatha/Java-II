package com.jnit.designpatterns;

public class FactoryDemo {

	public static void main(String[] args) {
        //Triangle t = new Triangle();
       // Shape s = new Triangle();
		Shape s = ShapeFactory.createShape("Triangle");
		
	}

}
interface Shape{
	public void drawShape();
}

class Triangle implements Shape{
	public void drawShape(){
		
	}
}

class Rectangle implements Shape{
	public void drawShape(){
		
	}
}
class Square implements Shape{
	public void drawShape(){
		
	}
}

class ShapeFactory{
	public static Shape createShape(String type){
		switch(type){
		case "Triangle":
			return new Triangle();
		case "Square":
			return new Square();
		default:
			return new Rectangle();
		}
	}
}
