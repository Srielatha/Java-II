package com.jnit.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
//out -> PrintStream object
public class PrintStreamDemo {
	//Println
	//Printf
	//format
	public static void main(String[] args) {
		System.out.println("hello");
		System.out.print("hello");
		
		int i = 461012;
		System.out.format("The value of i is: %d%n%s%n", i,"hello");//format and comma separated args
		System.out.printf("The value of i is: %d%n%s", i,"hello");
		System.out.format(Locale.FRANCE, "The value of the float " + "variable is %f  ",10.3242342);
		System.out.println();
		
		PrintStream p;
		try {
			p = new PrintStream("ps.txt");
			p.print("apple");
			p.println("banana");
			p.println("orange");
			p.write('c');//here write method takes only a int
			p.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		
	}

}
