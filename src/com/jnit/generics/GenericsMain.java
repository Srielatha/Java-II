package com.jnit.generics;

import java.util.ArrayList;
import java.util.List;

//<>
//creating custom generic types
//Type erasure -> compile time erasure
public class GenericsMain {

	public static void main(String[] args) {
		List<String>someList = new ArrayList<>();
		//List rawList = new ArrayList();
		someList.add("1");
		
		//List<String>sl = new ArrayList<Integer>();
		List<Object>ol = new ArrayList<>();
		
		Box<Integer>intBox = new Box<>();
		intBox.setContents(10);
		Box<String>stringBox = new Box<>();
		stringBox.setContents("hello");
		
		
		
		
		
	}
}
