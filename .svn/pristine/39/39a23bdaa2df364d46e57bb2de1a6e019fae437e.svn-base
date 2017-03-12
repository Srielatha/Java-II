package com.jnit.designpatterns;

public class UserMain {

	public static void main(String[] args) {
		User user = new User("Jack", null, "Patterson");
		UserBuilder ub = new UserBuilder();
		ub = ub.setfName("Jack").setmName("Patterson");
		User u = ub.build();
		ub = ub.setfName("Mike");
		User u1 = ub.build();
	}

}
