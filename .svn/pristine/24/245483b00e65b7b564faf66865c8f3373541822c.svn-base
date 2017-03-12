package com.jnit.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MarkAndReset {

	public static void main(String[] args) {
		try {
			//8192 bytes is the default buffer size
			BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File("a.txt")));
			if (fis.markSupported()) {
				char c = (char)fis.read();
				System.out.println(c);
				fis.mark(100);//Once a mark is set if we cross n characters reading, then performing a reset may throw an exception depending up on buffer size
				char c1 = (char)fis.read();
				System.out.println(c1);
				char c2 = (char)fis.read();
				System.out.println(c2);
				fis.reset();
				char c3 = (char)fis.read();
				System.out.println(c3);
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
