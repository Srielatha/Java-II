package com.jnit.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ChainingPaths {

	public static void main(String[] args) {
		//chaining paths
		Path path = Paths.get("../a.txt").getParent().normalize().toAbsolutePath();
		System.out.println(path);
		//getNameCount and getName
		Path path1 = Paths.get("C://data//a.txt");
		int x = path1.getNameCount();
		System.out.println(x);
		for(int i = 0; i<path1.getNameCount(); i++){
			System.out.println(path1.getName(i));
		}
		//Path methods
		System.out.println("-----");
		System.out.println(path1.getFileName());
		System.out.println(path1.getParent());
		System.out.println(path1.getRoot());
		System.out.println(path1.isAbsolute());
		System.out.println(path1.toAbsolutePath());
		Path currentParent = path1;
		
		//iterating until we reach the root
		while((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: "+currentParent);
		}
		
		//sub path
		System.out.println("Path is: "+path1);
		System.out.println("Subpath from 0 to 2 is: "+path1.subpath(0,2));
		System.out.println("Subpath from 1 to 2 is: "+path1.subpath(1,2));
		
		//relativize path
		//we can only relatavize compatible paths only
		Path path11 = Paths.get("fish.txt");
		Path path22 = Paths.get("birds.txt");
		Path path33 = Paths.get("C://data//a.txt");
		Path path44 = Paths.get("C://data");
		System.out.println(path11.relativize(path22));
		System.out.println(path22.relativize(path11));
		System.out.println(path33.relativize(path44));
		//resolve paths
		Path patha = Paths.get("/cats/../panther");
		Path pathb = Paths.get("food");
		System.out.println(patha.resolve(pathb));
		//resolving absolute paths
		Path pathc = Paths.get("/turkey/food");
		Path pathd = Paths.get("/tiger/cage");
		System.out.println(pathc.resolve(pathd));
		//cleaning up paths with normalize
		Path pathe = Paths.get("E:\\data");
		Path pathf = Paths.get("E:\\user\\home");
		Path relativePath = pathe.relativize(pathf);
		System.out.println(relativePath);
		System.out.println(pathe.resolve(relativePath).normalize());
		//real path
		try {
			System.out.println(Paths.get(".").toRealPath());
			System.out.println(Paths.get("../").toRealPath());
			System.out.println(Paths.get("C://data//a.txt").toRealPath());
			System.out.println(Paths.get("../../../../data//a.txt").toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
