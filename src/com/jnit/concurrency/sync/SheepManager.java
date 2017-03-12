package com.jnit.concurrency.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
//Object monitor lock
//Class level lock
public class SheepManager {
	private int sheepCount = 0;
	private final Object lock = new Object();
	//private AtomicInteger sheepCounter = new AtomicInteger(0);

	private  void incrementAndReport() {
		synchronized (this) {
			System.out.print((++sheepCount) + " ");
		}
		//System.out.println(sheepCounter.incrementAndGet());
		
	}

	// private void incrementAndReport() {
	// System.out.println(sheepCounter.incrementAndGet());
	// }

	// private synchronized void incrementAndReport() {
	// synchronized(lock){
	// System.out.print((++sheepCount) + " ");
	// }
	// }

	// private synchronized void incrementAndReport() {
	// System.out.print((++sheepCount) + " ");
	// }

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager manager = new SheepManager();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

	public static void printDaysWork() {
		synchronized (SheepManager.class) {
			System.out.print("Finished work");
		}
	}

	public static synchronized void printDaysWorkSM() {
		System.out.print("Finished work");
	}
}
