package com.jnit.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

//if we want to run a task schedule, then we use ScheduleES
//Schedule
//ScheduleAtFixedRate - Runnable
//ScheduleWithFixedDelay - Runnable - waits for your previous task to finish
public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
		Callable<String> c = () -> "hello";
		Runnable r1 = () -> {
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("runnable 1 finishing..");
		};
		ScheduledFuture<String>sf = ses.schedule(c, 5, TimeUnit.SECONDS);
		System.out.println(sf.get());
		Runnable r = () -> System.out.println("hello runnable..");
		//scheduled at fixed rate does not wait for the previous task to finish,
		//it just starts a new task based on the interval set
		ScheduledFuture sr = ses.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS);
		System.out.println(sr.get());
		
		//scheduled with fixed delay waits for the previous task to finish
//		ScheduledFuture sr = ses.scheduleWithFixedDelay(r1, 0, 1, TimeUnit.SECONDS);
//		System.out.println(sr.get());

		System.out.println("Finished");
		ses.shutdown();//this has to be an event in the app/framework which kills the service
		
	}

}
