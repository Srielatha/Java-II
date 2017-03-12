package com.jnit.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String s = "Hello File IO";
		try {
			FileOutputStream fos = new FileOutputStream(new File("c.txt"));
			byte[]contents = s.getBytes();
			//for(byte b: contents){
			//	fos.write(b);
			//}
			fos.write(contents);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
