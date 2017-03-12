package com.jnit.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterMain {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = dft.format(LocalDateTime.now());
		System.out.println(formattedDate);
		LocalDate ld = LocalDate.parse(formattedDate);
		LocalDate ld1 = LocalDate.parse(formattedDate,dft);
		System.out.println(ld);
		System.out.println(ld1);
		LocalTime lt = LocalTime.parse("01:20");
		System.out.println(lt);
		LocalDateTime ldt = LocalDateTime.parse("2016-01-21T01:20:35");
		System.out.println(ldt);
		
		//short,medium, long and full formats
		DateTimeFormatter dft1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter dft2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dft3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter dft4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter dft5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

		LocalDateTime ldt1 = LocalDateTime.now();//SHORT,MEDIUM		
		System.out.println(ldt1.format(dft1));
		System.out.println(ldt1.format(dft2));
		LocalDate dt = LocalDate.now();//LONG,FULL
		System.out.println(dt.format(dft3));
		System.out.println(dt.format(dft4));
		LocalTime ltme = LocalTime.now();//SHORT,MEDIUM
		System.out.println(ltme.format(dft5));
		//System.out.println(ltme.format(dft4));
		//ISO
		System.out.println(ldt1.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		System.out.println(ltme.format(DateTimeFormatter.ISO_TIME));

		
	}

}
