package com.jnit.designpatterns;

public final class ImmutableA {
	private Address address;
	
	public ImmutableA(Address address){
		this.address = new Address();
		this.address.setCity(address.getCity());
		this.address.setState(address.getState());
	}
	
	public Address getAddress() {
		Address address = new Address();
		address.setCity(this.address.getCity());
		address.setState(this.address.getState());
		return address;
	}
	
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Lewisville");
		address.setState("TX");
		ImmutableA ima = new ImmutableA(address);
		address.setCity("Irving");
		System.out.println(ima.getAddress().getCity());
		//ima.getAddress().setCity("Coppell");
		
	}
}
