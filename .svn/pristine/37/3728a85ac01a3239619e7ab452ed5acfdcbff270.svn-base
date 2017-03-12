package com.jnit.io;

import java.io.File;
import java.util.Date;
//The File class is used to read information
//about existing files and directories, list the contents of a directory, and create/delete files
//and directories
public class FileDemo {

	public static void main(String[] args) {
		System.out.println(java.io.File.separator);
		System.out.println(System.getProperty("file.separator"));
		File file = new File("C:\\data");
		//File unixfile = new File("/home/data/zoo.txt");
		System.out.println("File Exists: " + file.exists());
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
				System.out.println(new Date(file.lastModified()));
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				}
			}
		}
	}

}
