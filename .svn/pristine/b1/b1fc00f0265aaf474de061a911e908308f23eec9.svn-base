package com.jnit.functional;

import java.util.function.Predicate;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal("A1", true, false);
		//Anonymous inner type
		CheckTrait t = new CheckTrait() {
			
			@Override
			public boolean test(Animal animal) {
				return animal.canHop();
			}
		};
		
		Predicate<Animal>animalPredicate = new Predicate<Animal>() {
			@Override
			public boolean test(Animal t) {
				return t.canHop();
			}
			
		};
		Predicate<Animal>animalPredicate1 =(Animal t11) -> {return t11.canHop();};
		
		CheckTrait t1 = (a) ->a.canHop();
		
		//checkTraits((a)-> a.canHop(),animal);
		//checkTraits((a)-> a.canSwim(),animal);
		checkTraits(animalPredicate1,animal);
		
	}
	
	public static void checkTraits(CheckTrait ct, Animal animal){
		if(ct.test(animal)){
			//do something
		}
	}
	
	public static void checkTraits(Predicate<Animal> ct, Animal animal){
		if(ct.test(animal)){
			//do something
		}
	}

}
