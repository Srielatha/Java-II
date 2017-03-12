package com.jnit.io.userinteraction;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

//readLine()
//readPassword()
//writer() -append()
//flush()
//format() --printwriter format
//printf()--printwriter printf
//reader()

public class Newway {
    //from windows command line
	//cd to the src folder of the project and then execute below
	//javac com/jnit/io/userinteraction/Newway.java
	//java com/jnit/io/userinteraction/Newway
	public static void main(String[] args) throws IOException {
		//returns a singleton console object
		Console console = System.console();//works only from your OS command line
		//System.out.println("Enter something....");
		String userInput = console.readLine("Enter something...");
		System.out.println("You entered the following: " + userInput);
		console.writer().write("You entered the following: " + userInput);
		console.flush();//any buffered content will be flushed and is adviced to call before calling readline or readpassword
		char[] password = console.readPassword("Enter password..");
		console.writer().println(Arrays.toString(password));
		//reader
		Integer age = null;
		console.writer().print("What is your age? ");
		console.flush();
		BufferedReader reader = new BufferedReader(console.reader());
		String value = reader.readLine();
		age = Integer.valueOf(value);
		console.writer().println(age);
		reader.close();
	}

}
	