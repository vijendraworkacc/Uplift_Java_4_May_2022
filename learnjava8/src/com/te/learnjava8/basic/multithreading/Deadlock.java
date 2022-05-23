package com.te.learnjava8.basic.multithreading;

class Resource01 {
	synchronized public void resource01(Resource02 r2) {
		System.out.println("Using sysnchronized resource resource01!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		r2.resource02(this);
		System.out.println("resource01 resource executed!");
	}
}

class Resource02 {
	synchronized public void resource02(Resource01 r1) {
		System.out.println("Using sysnchronized resource resource02!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		r1.resource01(this);
		System.out.println("resource02 resource executed!");
	}
}

public class Deadlock {
	public static void main(String[] args) {
		Resource01 resource01 = new Resource01();
		Resource02 resource02 = new Resource02();
		Thread thread01 = new Thread(() -> resource01.resource01(resource02));
		Thread thread02 = new Thread(() -> resource02.resource02(resource01));
		thread01.start();
		thread02.start();
	}
}
