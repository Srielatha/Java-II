package com.jnit.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		ldt = ldt.plus(Duration.of(20, ChronoUnit.MINUTES));
		ldt = ldt.plus(Duration.of(2, ChronoUnit.HOURS));
		ldt = ldt.plus(Duration.of(15, ChronoUnit.SECONDS));
		ldt = ldt.plus(Duration.of(10, ChronoUnit.NANOS));
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalTime lt = LocalTime.now();
		//both the inputs have to be the same data type
		System.out.println(ChronoUnit.HOURS.between(ldt1, ldt));
		System.out.println(ChronoUnit.MINUTES.between(ldt1, ldt));
		System.out.println(ChronoUnit.SECONDS.between(ldt1, ldt));
		//System.out.println(ChronoUnit.SECONDS.between(ldt1, lt));
	
		
		

	}

}
