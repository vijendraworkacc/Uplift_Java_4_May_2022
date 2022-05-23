package com.te.learnjava8.basic.multithreading;

public class SleepingThread extends Thread {
	@Override
	public void run() {
		String str = "abcdefhijkl";
		for (int i = 0; i < str.length(); i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(str.charAt(i));
		}
	}
}
