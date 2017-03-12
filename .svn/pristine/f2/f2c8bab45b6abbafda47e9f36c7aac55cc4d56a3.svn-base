package com.jnit.nio;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemsDemo {

	public static void main(String[] args) throws URISyntaxException {
		Path path = FileSystems.getDefault().getPath("C:\\data");
		Path path1 = FileSystems.getFileSystem(new URI("http://www.abc.com")).getPath("/home/data");
		//legacy file object
		File file = path.toFile();
		Path path2 = file.toPath(); 
		
	}

}
