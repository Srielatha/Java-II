package com.jnit.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) {
		//String s = "hello world";
		String[] strs = {"hello appi ", "hello apple"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("s.txt")),1024);
			for (String string : strs) {
				writer.write(string);
				writer.flush();//flush will make sure the read data is written before populating buffer again
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
