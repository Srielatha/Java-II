package com.jnit.io.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//Serialization - saving objects to storage in the form of bits and bytes
//Deserialization - brining in the objects back to life in heap from the storage
//Deserialization doesn't make use of new keyword to create the object
public class TestSerialization {

	public static void main(String[] args) {
		//saving in the object state in to some storage
		//static and transient variables are not serialized
		//when you serialize an object the entire object graph gets serialized
		//you can use fileoutputstream and objectoutputstream to serialize an object
		//you can use fileinputstream and objectinputstream to deserialize an object
		//state here is your instance variable values
		Address a1 = new Address();
		a1.setCity("Lewisville");
		a1.setState("TX");

		Employee e = new Employee();
		e.setId("1");
		e.setName("emp1");
		e.setAddress(a1);
		
		Employee e1 = new Employee();
		e1.setId("2");
		e1.setName("emp2");
		e1.setAddress(a1);
		
		try {
			//java .io packages
			FileOutputStream fo = new FileOutputStream("emp1.ser");//file name is emp1.ser
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(e);
			oo.writeObject(e1);
			oo.close();
		} catch (IOException io) {
			System.out.println(io);
			io.printStackTrace();
		}

	}

}
