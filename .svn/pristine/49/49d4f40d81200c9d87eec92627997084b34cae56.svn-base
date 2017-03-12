package com.jnit.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Throwable -> Exception(RTE(Unchecked) and Non RTE(Checked)) and Error
//try-catch, throw the exception to caller with throws
//throw -> method body -> Illegalargument exception
//mutiple catch blocks for a single try
//try/catch/finally, try with finally
//try with resources - auto resource cleanup(Autocloseable)
public class Main {

	public static void tcf() throws Exception{
		try{
			throw new Exception("something happend in try");
		}catch(Exception e){
			throw new Exception("something happend in catch");
		}finally{
			throw new Exception("something happend in finally");
		}
	}
	public static void test(int x){
		if(x <= 0){
			throw new IllegalArgumentException("Argument passed is not valid");
		}
		//something with x
	}
	
	public static void readDataFromdbAndwriteitofile() throws Exception{
		try{
			Connection conn = DriverManager.getConnection("");
			FileOutputStream ios = new FileOutputStream("results.txt");
			
		}
		//catch(Exception e){
//			e = new RuntimeException("something happend");
//			throw e;
//		}
	catch(SQLException | IOException e){
		//e = new RuntimeException("something happend");
		throw e;
	}
	}
	
	public static void main(String[] args) {
		test(0);
		System.out.println("finished main");
	}

}
