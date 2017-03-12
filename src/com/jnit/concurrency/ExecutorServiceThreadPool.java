package com.jnit.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//CachedThreadPool -- creates threads when needed as the tasks arrives, submitting too many tasks which overwhelm the system
//FixedThreadPool(int noofThreads)-- These five threads would be used to process all incoming tasks
//ScheduledThreadPool
public class ExecutorServiceThreadPool {

	public static void main(String[] args) {
		// Use the executor created by the newCachedThreadPool() method
		// only when you have a reasonable number of threads
		// or when they have a short duration.
		//ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//5 for ses represents the number of threads that needs to be kept in the pool, even if idle
		//ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
		for (int i = 0; i <= 5; i++) {
			Task task = new Task("Task " + i);
			System.out.println("A new task has been added : " + task.getName());
			executor.execute(task);
		}
		executor.shutdown();
	}

}

class Task implements Runnable {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {
		try {
			Long duration = (long) (Math.random() * 10);
			System.out.println("Doing a task during : " + name);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
