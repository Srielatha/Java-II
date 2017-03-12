package com.jnit.exceptions;

import java.sql.SQLException;

public class CDMain {
	//try with resource -> suppressed exceptions
	public static void main(String[] args) throws Exception {
		C c  = null;
		D d = null;
		try{
			c = new C();
			d = new D();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				c.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					d.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		twr();
	}
	
	public static void twr() throws Exception{
		try(C c = new C(); D d = new D()){
		
		}
//		catch(Exception e){
//			//Throwable[] suppressed = e.getSuppressed();
//			e.printStackTrace();
//		}

	}
	
	public static void checked(){
		try{
			String s = null;
			s.toLowerCase();
		}catch(Exception se){
			se.printStackTrace();
		}
	}

}
