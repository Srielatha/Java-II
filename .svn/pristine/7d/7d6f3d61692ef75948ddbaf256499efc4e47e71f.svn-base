package com.jnit.io.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final double PI=3.14;

	private String name;

	private transient String id;//exclude this field from serialization process

	private String phoneNo;
	
	private String xyz="someValue";

	private String lineNo;

	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getXyz() {
		return xyz;
	}
	
	public void setXyz(String xyz) {
		this.xyz = xyz;
	}


	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}

	public String getLineNo() {
		return lineNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
