package com.jnit.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//wrap low level to high level
//define the buffer(array)-> set buffer size
//bis.read(buffer)-> returns int(represents number of bytes read)
//int = -1, its done reading
//close, low level and high level
public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(new File("a.txt"));
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[]contents = new byte[5];
			int bytesread=0;
			while((bytesread = bis.read(contents)) != -1){
				System.out.println(bytesread);
				String str = new String(contents, 0, bytesread);
				System.out.println(str);
			}
			bis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
