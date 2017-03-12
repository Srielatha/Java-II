package com.jnit.designpatterns;

//multi threading
//double checked locking
public class Singleton {

	private static Singleton singleton;
	
//	static{
//		singleton = new Singleton();
//	}
	
	private Singleton(){
		
	}
	
	//lazy instantiation
	//thread safe singleton
	//double checked locking
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
	
	
}
