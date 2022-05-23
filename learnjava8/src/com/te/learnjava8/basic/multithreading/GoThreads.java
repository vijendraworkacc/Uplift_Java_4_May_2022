package com.te.learnjava8.basic.multithreading;

public class GoThreads {
	public static void main(String[] args) {
		/* Create threads using Thread class */
		// Thread01 thread01 = new Thread01();
		// Thread02 thread02 = new Thread02();
		// thread02.start();
		// thread01.start();

		/* Create threads using Runnable interface */
		// Thread thread011 = new Thread(new Thread011());
		// Thread thread022 = new Thread(new Thread022());
		// thread022.start();
		// thread011.start();

		SleepingThread sleepingThread = new SleepingThread();
		System.out.println(sleepingThread.getPriority());
		sleepingThread.start();

	}
}
