package com.te.learnjava8.basic.multithreading;

public class Thread011 implements Runnable {
	@Override
	public void run() {
		String str = "abcdefhijkl";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
