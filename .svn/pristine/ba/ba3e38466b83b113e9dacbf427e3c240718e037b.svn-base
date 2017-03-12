package com.jnit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Flat map converts the below to a flat stream
//Stream<String[]>
//Stream<Set<String>>
//Stream<List<String>>
//Stream<List<Object>>
public class FlatMapMain {

	public static void main(String[] args) {
		Stream<List<String>> lStreams = Stream.of(Arrays.asList("hello","bye","a"),Arrays.asList("red","blue"));
		lStreams.flatMap(x -> x.stream()).map(a -> a.toUpperCase()).forEach(System.out::println);
		
		Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        
        List<String>names = list.stream().map(s -> s.getBooks())
        .flatMap(x -> x.stream())
        .distinct()
        .collect(Collectors.toList());
        names.forEach(System.out::println);
	}

}

class Student{
	private String name;
    private Set<String> books;

    public void addBook(String book) {
        if (this.books == null) {
            this.books = new HashSet<>();
        }
        this.books.add(book);
    }
    public void setName(String name) {
		this.name = name;
	}
    public Set<String> getBooks() {
		return books;
	}
}
