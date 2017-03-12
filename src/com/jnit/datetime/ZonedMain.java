package com.jnit.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class ZonedMain {

	public static void main(String[] args) {
		ZonedDateTime zdtime1 = ZonedDateTime.now();
		ZoneId zoneId = ZoneId.of("US/Eastern");
		ZonedDateTime zdtime2 = ZonedDateTime.now(zoneId);
		System.out.println(zdtime1);
		System.out.println(zdtime2);
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(zdtime1.toInstant());
		instant = instant.plus(Duration.ofHours(1));
		instant = instant.plus(1,ChronoUnit.DAYS);
		instant = instant.plus(1,ChronoUnit.HOURS);
		
		//instant = instant.plus(Period.ofMonths(1));
		//instant = instant.plus(1,ChronoUnit.MONTHS);//we can only do days and hours
		System.out.println(instant);
	}

}
