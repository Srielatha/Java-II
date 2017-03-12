package com.jnit.resourcebundle.classes;

import java.util.ListResourceBundle;

import com.jnit.io.serialization.Employee;

public class Zoo_en extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		return new Object[][]{
			{"hello","hello"},
			{"emp", new Employee()}
		};
	}

}
