package com.jnit.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//March 13 - From 1:59 we go to 3 AM
//Nov 6 - From 1 to 1:59(twice)
public class DST {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(1, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); // 2016–03–13T01:30–05:00[US/Eastern]
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]
		
		System.out.println("---------------");
		
		LocalDate date1 = LocalDate.of(2016, Month.NOVEMBER, 6);
		LocalTime time1 = LocalTime.of(1, 30);
		ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone);
		System.out.println(dateTime1); // 2016–11–06T01:30–04:00[US/Eastern]
		System.out.println(dateTime1.toInstant());
		dateTime1 = dateTime1.plusHours(1);
		System.out.println(dateTime1); // 2016–11–06T01:30–05:00[US/Eastern]
		System.out.println(dateTime1.toInstant());
		dateTime1 = dateTime1.plusHours(1);
		System.out.println(dateTime1); // 2016–11–06T02:30–05:00[US/Eastern]
		System.out.println(dateTime1.toInstant());
		
		System.out.println("---------------");
		
		LocalDate date2 = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time2 = LocalTime.of(2, 30);
		ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zone);
		System.out.println(dateTime2); // 2016–03–13T03:30–04:00[US/Eastern]
	}

}
