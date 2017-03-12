package com.jnit.io.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("emp1.ser");
			ObjectInputStream oi = new ObjectInputStream(fi);

			Employee e1 = (Employee) oi.readObject();
			System.out.println(e1.getId() + " " + e1.getName()
					+ e1.getPhoneNo());
			System.out.println(e1.getAddress());

			Employee e2 = (Employee) oi.readObject();
			System.out.println(e2.getId() + " " + e2.getName()
					+ e2.getPhoneNo());
			System.out.println(e2.getAddress());
			oi.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
