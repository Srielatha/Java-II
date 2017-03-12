package com.jnit.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileInteractions {

	public static void main(String[] args) throws IOException {
		//check if path exists
		Path path = Paths.get("C://data//a.txt");
		System.out.println(Files.exists(path));
		//check if two paths pointing to same location
		Path path1 = Paths.get("C://data//a.txt");
		System.out.println(Files.isSameFile(path, path1));
		//create directories
		Files.createDirectory(Paths.get("C://data//dir1"));//if data is not there it will throw an exception
		Files.createDirectories(Paths.get("C://dir1//dir2"));
		//copy files
		Files.copy(Paths.get("C://data"),Paths.get("C://data1"));
		Files.copy(Paths.get("C://data//a.txt"),Paths.get("C://data1//a.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		
		
		
	}

}
