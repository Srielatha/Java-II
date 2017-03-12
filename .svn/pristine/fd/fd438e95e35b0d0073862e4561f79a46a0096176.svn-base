package com.jnit.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

//Period - days,weeks,months,years(We can not chain period and duration methods)
//Duration - days, minutes,seconds, hours, millis and nanos(datetime and time)
public class DateModificationMain {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		date = date.plus(Period.ofDays(10));
		System.out.println(date);
		date = date.plusDays(10);
		System.out.println(date);
		date = date.plusMonths(2);
		date = date.plus(Period.ofMonths(3));
		date = date.minusDays(10);
		date = date.minus(Period.ofWeeks(2));
		date = date.minus(Period.ofWeeks(2).ofDays(2));//dont chain
		date = date.minus(Period.of(2,1,5));//no weeks here
		
		LocalDateTime ldt = LocalDateTime.now();
		ldt = ldt.plus(Duration.ofMinutes(20));
		ldt = ldt.plus(Duration.ofHours(2));
		ldt = ldt.plus(Duration.ofSeconds(15));
		ldt = ldt.plus(Duration.ofNanos(10));
		//date.plus(Duration.ofDays(1));//run time exception
		
		//printing period and duration
		System.out.println(Period.of(2, 3, 2));
		System.out.println(Period.of(0, 2, 1));
		System.out.println(Period.ofWeeks(1));
		System.out.println(Period.between(LocalDate.now(), date).getDays());
		System.out.println(Duration.ofDays(2));
		System.out.println(Duration.ofHours(2));
		System.out.println(Duration.ofMinutes(20));
		System.out.println(Duration.ofSeconds(10));
		System.out.println(Duration.ofMillis(100));
		System.out.println(Duration.ofNanos(100));
		System.out.println(Duration.between(LocalDateTime.now(),ldt).toHours());
		
	}

}
