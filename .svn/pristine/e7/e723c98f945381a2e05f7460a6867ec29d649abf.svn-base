package com.jnit.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("a.txt"));
			String line = br.readLine();
			while(line != null){
				System.out.println(line);
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
