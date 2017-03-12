package com.jnit.generics.bounds;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jnit.generics.Laptop;
import com.jnit.generics.Shippable;

//bounded generics -><String>
//unbounded generics -> <?>
//wildcards -> lower bound wild cards -> ? super Type
//upper bound wild cards -> u bet -> upper bound extends Type
//? - no add but we can add nulls and can perform removals
//? extends no add but we can add nulls and can perform removals
//? super ->add/remove is generally allowed
public class BoundsMain {

	public static void test(List<? extends Number>numberList){
		
	}
	public static void test1(List<? extends Animal>animals){
		//animals.add(new Dog());
	}

	public static void testShip(List<? extends Shippable<Laptop>>items){
		
	}

	//Animals and Objects
	public static void test11(List<? super Animal>animals){
		animals.add(new Dog());
	}
	//Cats, Animals, Objects
	public static void test111(List<? super Cat>animals){
		animals.add(new Cat());
		//animals.add(new Animal());
	}
	
	public static void test1111(List<Animal>animals){
		
	}
	
	public static void test111111(Animal a){
		
	}

	public static void main(String[] args) {
		List<Animal>animals = new ArrayList<>();
		List<Dog>dogs = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Animal());
		animals.add(new Cat());
		test1(animals);
		dogs.add(new Dog());
		test1(dogs);
		//Animals, Objects
		List<? super Animal>animalss = new ArrayList<>();
		animalss.add(new Cat());
		animalss.add(new Dog());
		//Dogs, Animals, Object
		List<? super Dog>animalss1 = new ArrayList<>();
		//animalss1.add(new Cat());
		animalss1.add(new Dog());
		//IOException,Exception,Object
		List<? super IOException>exceptions = new ArrayList<>();
		//exceptions.add(new Exception());
		exceptions.add(new FileNotFoundException());
		exceptions.add(new IOException());
		//exceptions.add(new SQLException());
		
		List<?>someList = new ArrayList<>();
		//someList.add(10);
		someList.add(null);
		List<?>someList1 = new ArrayList<Integer>();
		//someList1.add(10);
		List<Integer>intList = new ArrayList<>();
		intList.add(1);
		print(intList);
	}
	
	public static void print(List<?>someList){
		someList.remove(new Integer(1));
		System.out.println(someList);
	}
	
	public static void print1(List<?>someList){
		for(Object o : someList){
			System.out.println(o);
		}
	}

}

class Animal{
	
}

class Cat extends Animal{
}

class Dog extends Animal{
}
