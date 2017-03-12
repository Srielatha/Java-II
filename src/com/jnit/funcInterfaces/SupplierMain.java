package com.jnit.funcInterfaces;

import java.time.LocalDate;
import java.util.function.Supplier;
//Supplier -> get()-> returns same object
public class SupplierMain {

	public static void main(String[] args) {
		Supplier<StringBuffer> sbufSupplier = new Supplier<StringBuffer>() {
			@Override
			public StringBuffer get() {
				return new StringBuffer();
			}
		};
		
		//() -> new StringBuffer()
		Supplier<StringBuffer> sbufSupplier1 = StringBuffer::new;
		StringBuffer s = sbufSupplier1.get();
		Supplier<LocalDate> ldtSupplier = () -> LocalDate.now();
		LocalDate date = ldtSupplier.get();
		System.out.println(date);	
		
	}

}
