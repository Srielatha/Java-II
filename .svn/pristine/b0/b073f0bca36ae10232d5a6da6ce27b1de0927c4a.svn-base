package com.jnit.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("pw.txt");
			//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pw.txt")));
			pw.print("hello world");//all primitives, string and object
			pw.write(5);
			pw.write(String.valueOf(10.34));//int and string,so convert object to string and use write
			pw.println("hello appi");//same as print
			pw.printf("The value of i is: %d%n%s", 10,"hello");//format is same as printf
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
