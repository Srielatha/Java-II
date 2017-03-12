package com.jnit.concurrency;
//
public class CreatingThread {

	public static void main(String[] args) {
		//void run(){}
		Runnable r = () -> System.out.println("hello world");
		Thread t = new Thread(r);
		//t.setDaemon(true);
		t.start();
		//t.run();
		
		Thread t1 = new PrinterThread();
		t1.start();
		//t1.start();//Illegal thread state exception
		System.out.println("Main finished execution");
	}

}

class PrinterThread extends Thread{
	@Override
	public void run() {
		System.out.println("printed something");
	}
}
