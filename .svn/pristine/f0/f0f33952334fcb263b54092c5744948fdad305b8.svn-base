package com.jnit.concurrency;
//Thread properties(id,name,state,isdeamon,isAlive,isInterrupted) and 
//states(new, Runnable,Blocked(waiting for monitor lock),Terminated,
//Timed-Wait(wait until time passes),Waiting(wait until some other thread notifies you to go))
public class ThreadState {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->System.out.println("Thread -1"),"MyThread");
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		t1.start();
		System.out.println(t1.getState());
		System.out.println(t1.getState());

	}

}
