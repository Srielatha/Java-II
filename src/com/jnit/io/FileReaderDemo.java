package com.jnit.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try {
			FileReader fi = new FileReader(new File("a.txt"));
			int i;
			while((i = fi.read()) != -1){
				System.out.print((char)i);
			}
			fi.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
