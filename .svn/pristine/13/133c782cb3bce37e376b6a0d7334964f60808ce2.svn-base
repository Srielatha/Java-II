package com.jnit.nio;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
//representation of ur filesystem
public class ConstructingPaths {

	public static void main(String[] args) throws URISyntaxException {
		Path path1 = Paths.get("C:\\users\\abc.txt");
		Path path2 = Paths.get("/home/appi/abc.txt");
		Path path3 = Paths.get("nio-notes.txt");
		
		Path path4 = Paths.get("C:","Users","abc.txt");
		//Uniform resource identifier
		//file,http,https,ftp
		Path path5 = Paths.get(new URI("http://www.wiley.com"));
		Path path6 = Paths.get(
		new URI("ftp://username:password@ftp.the-ftp-server.com"));
		
		Path path7 = Paths.get(new URI("file:///home/appi"));//only absolute path to relative path
		
		URI uri = path7.toUri();
		
		
	}

}
