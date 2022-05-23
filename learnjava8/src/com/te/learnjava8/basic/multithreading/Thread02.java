package com.te.learnjava8.basic.multithreading;

public class Thread02 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
