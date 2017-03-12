package com.jnit.concurrency;

public class ThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		//Thread.currentThread().join();
		Thread t1 = new Thread(()->System.out.println("Thread -1"));
		Thread t2 = new Thread(()->System.out.println("Thread - 2"));
		Thread t3 = new Thread(()->System.out.println("Thread - 3"));
		t1.start();
		t2.start();
		t1.join();
		t2.join();//throws Interrupted
		t3.start();
		t3.join();
		System.out.println("Finished main...");
	}

}
