package Runnable_interface;

import Deadlock.thread1;

public class Five implements Runnable {
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		System.out.println("five:-"+name);
		System.out.println("five:-"+name);
		System.out.println("five:-"+name);
		System.out.println("five:-"+name);
		System.out.println("five:-"+name);
		System.out.println("five:-"+name);
		System.out.println("five:-"+name);
	

	}


}
