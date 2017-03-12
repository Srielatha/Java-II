package com.jnit.enums;
//constructor get called only once
//enum can not extend anything else
//abstract methods inside enums
public enum Season {
	WINTER{
		public void printLevel(){
		System.out.println("Medium");
	};},
	SUMMER{public void printLevel(){
		System.out.println("Medium");
	};},
	SPRING{public void printLevel(){
		System.out.println("Medium");
	};},
	FALL{public void printLevel(){
		System.out.println("Medium");
	};};
	//constructor
	private String level;
//	private Season(String level){
//		this.level = level;
//	}
	
	public abstract void printLevel();
	
	public String getLevel() {
		return level;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
}
