package com.jnit.concurrency.advanced;
//by employing sequential access to ur locks
//Lock starvation
//LiveLock - T1 ->lock1 -> lock1, lock2 T2-lock2 -lock2-lock1
//Synchronization -> Lock interface
public class DeadLock {

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {

			while (true) {				
				synchronized (lock1) {
					synchronized (lock2) {
						System.out.println("do something ");
					}
				}
			}
		}
	});

	Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			while (true) {
				synchronized (lock2) {
					synchronized (lock1) {
						System.out.println("do something and something else");
					}
				}
			}
		}
	});

	public static void main(String[] args) {
		
		DeadLock dl = new DeadLock();
		dl.t1.start();
		dl.t2.start();
	}
}
