package com.jnit.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String x = "Whats up buddy ?";
		try {
			FileWriter writer = new FileWriter(new File("j.txt"));
			//for(char c: x.toCharArray()){
			//	writer.write(c);
			//}
			writer.write(x);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
