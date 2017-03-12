package com.jnit.streams.parallel;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//For small streams using parallel streams is not a good idea
//Use parallel streams when you have to process larger data set
//The performance vary up on the machine configuration like cpu, ram etc..
//Order is not guaranteed in parallel streams
public class WhaleDataCalculator {
	public int processRecord(int input) {
		try {
			TimeUnit.MILLISECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return input + 1;
	}

	public void processAllData(List<Integer> data) {
		//data.stream().map(a -> processRecord(a)).count();
		data.stream().parallel().map(a -> processRecord(a)).count();
	}

	public static void main(String[] args) {
		WhaleDataCalculator calculator = new WhaleDataCalculator();
		// Define the data
		List<Integer> data = new ArrayList<Integer>();
		for(int i=0; i<4000; i++) data.add(i);
		// Process the data
		//long start = System.currentTimeMillis();
		LocalTime startTime = LocalTime.now();
		calculator.processAllData(data);
		LocalTime endTime = LocalTime.now();
		//double time = (System.currentTimeMillis()—start)/1000.0;
		// Report results
		System.out.println("\nTasks completed in: "+ChronoUnit.SECONDS.between(startTime, endTime)+" seconds");
		}
}
