package com.jnit.funcInterfaces.primitive;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		Supplier<StringBuffer>s = StringBuffer::new;
		System.out.println(s.get());
		
		BooleanSupplier bs = () -> true;
		System.out.println(bs.getAsBoolean());
		
		IntSupplier is = () -> 1;
		System.out.println(is.getAsInt());
		
		LongSupplier ls = () -> new Long(10);
		System.out.println(ls.getAsLong());
		
		DoubleSupplier ds = () -> 3.14;
		System.out.println(ds.getAsDouble());
	}

}
