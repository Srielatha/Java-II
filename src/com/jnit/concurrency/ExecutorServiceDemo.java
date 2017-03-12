package com.jnit.concurrency;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//java 5 executor service
//Single thread executor
//thread pool
//scheduled executor
//execute-Runnable,submit-Callable and Runnable
//Shutting down -> shutDown(),shutDownNow()
//awaitTermination
//Future -> we can use Future object to store the rest
//execute -> Runnable
//Submit -> Callable and Runnable
//Runnable -> Future -> null -> get
//Callable -> Future<T> call(){}
public class ExecutorServiceDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService es = null;
		try {
			// Single thread executor
			// all the tasks gets executed one after the other
			es = Executors.newSingleThreadExecutor();
			es.execute(() -> System.out.println(Thread.currentThread().getName()));
			es.execute(() -> System.out.println("Second Task"));
			es.execute(() -> System.out.println("Third Task"));
			// executing callable FI which return Future
			Future<Integer> f = es.submit(() -> {
				Thread.sleep(1000);
				return 10;
			});
			// System.out.println("After 100 miilis "+f.get(100,
			// TimeUnit.MILLISECONDS));//throws Timeout exeception
			System.out.println(f.get());// wait untils it gets the result

			Future result = es.submit(() -> System.out.println("runnable with submit"));
			System.out.println(result.get());// returns null for runnable
		} finally {
			es.shutdown();// waits until all tasks are completed
			// List<Runnable>incompletedTasks = es.shutdownNow();//stop
			// executing tasks and doesn't start new tasks and returns
			// incompleted tasks
			System.out.println(es.isShutdown());// returrns true if executor
												// service is shut down
			System.out.println(es.isTerminated());// returns true if all tasks
													// are completed
			if (es != null) {
				es.awaitTermination(1, TimeUnit.MINUTES);
				// Check whether all tasks are finished
				if (es.isTerminated())
					System.out.println("All tasks finished");
				else
					System.out.println("At least one task is still running");
			}
		}

	}
}
