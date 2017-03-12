package com.jnit.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateMain {

	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		LocalTime ltime = LocalTime.now();
		LocalDateTime ldtime = LocalDateTime.now();
		ZonedDateTime zdtime = ZonedDateTime.now();
		Instant instant = Instant.now();
		System.out.println(ldate);
		System.out.println(ltime);
		System.out.println(ldtime);
		System.out.println(zdtime);
		System.out.println(instant);
		
		System.out.println(ldate.getDayOfMonth());
		System.out.println(ldate.getDayOfYear());
		System.out.println(ldate.getDayOfWeek());
		System.out.println(ldate.getYear());
		System.out.println(ldate.getMonth());
		System.out.println(ldate.getMonthValue());
		
	}

}
