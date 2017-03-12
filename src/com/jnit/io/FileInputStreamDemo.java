package com.jnit.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//fis.read() -> int -> instead of byte we have an int
public class FileInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("a.txt"));
			int i;
			//the fis.read() method returns a integer instead of byte eventhough its a byte stream, the reason is we need -1 to be returned to identify the end of stream
			while ((i = fis.read()) != -1){//we continue the while loop until fis.read() returns -1 which represents end of the stream
				System.out.println((char)i);
			}
			fis.close();//resource leaks
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
