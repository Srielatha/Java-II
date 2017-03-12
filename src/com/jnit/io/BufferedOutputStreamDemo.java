package com.jnit.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
//create low level stream object
//create bufferedoutputstream and pass low level stream
//flush -> flush the contents from OS memory to the file,, 
public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		String s = "Hello appi whats up ?";
		try {
			FileOutputStream fos = new FileOutputStream(new File("h.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			byte[]bytes = s.getBytes();
			bos.write(bytes);
			bos.flush();
			bos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
