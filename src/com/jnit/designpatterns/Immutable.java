package com.jnit.designpatterns;
//final
//Cloneable is a marker interface
public final class Immutable implements Cloneable{
	private String text;
	
	public Immutable(String text){
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("You can not clone me");
	}
	
}
