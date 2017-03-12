package com.jnit.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SkipMain {

	public static void main(String[] args) {
		try {
			BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File("a.txt")));
			if (fis.markSupported()) {
				char c = (char)fis.read();
				System.out.println(c);
				fis.skip(1);
				char c1 = (char)fis.read();
				System.out.println(c1);
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
