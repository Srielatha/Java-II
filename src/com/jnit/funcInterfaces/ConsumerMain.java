package com.jnit.funcInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Consumer -> void accept -> One parameter
public class ConsumerMain {

	public static void main(String[] args) {
		Consumer<StringBuffer>sb = new Consumer<StringBuffer>() {
			@Override
			public void accept(StringBuffer t) {
				t.append("bye");
			}		
		};
		Consumer<String>sconsumer = (a) -> System.out.println(a+",DFW");
		sconsumer.accept("hello");
		sconsumer.accept("how are you ?");
		
		StringBuffer sbuffer = new StringBuffer("hello");
		Consumer<StringBuffer>sbconsumer = (a)->{a.append(" world"); a.append("bye");};
		sbconsumer.accept(sbuffer);
		System.out.println(sbuffer);
		
		List<String>list = Arrays.asList("hello","hi","how","are","you");
		list.forEach((h) -> System.out.println(h));
		
	}

}
