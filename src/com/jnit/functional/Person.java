package com.jnit.functional;

import java.time.LocalDate;

public class Person {

	private LocalDate birtdate;
	
	public Person(LocalDate birtdate) {
		super();
		this.birtdate = birtdate;
	}

	public void setBirtdate(LocalDate birtdate) {
		this.birtdate = birtdate;
	}
	
	public LocalDate getBirtdate() {
		return birtdate;
	}
	
}
