package com.jnit.concurrency;

import java.util.concurrent.TimeUnit;

public class ThreadPolling {
	static int count;
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = () -> {
			for(int i=0; i<100;i++){
				count++;
			}
		};
		Thread t = new Thread(r);
		t.start();
		while(true){
			if(count == 100){
				System.out.println("breaking..");
				break;
			}
			System.out.println("Sleeping for one second");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Waking up..");
		}
		
		System.out.println(count);
	}

}
