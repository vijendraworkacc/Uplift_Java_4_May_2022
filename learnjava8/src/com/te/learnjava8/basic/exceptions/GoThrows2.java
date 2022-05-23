package com.te.learnjava8.basic.exceptions;

public class GoThrows2 {
	public static void m3() throws InterruptedException, IndexOutOfBoundsException, ArithmeticException {
		Thread.sleep(1234);
	}

	public static void m2() throws InterruptedException {
		m3();
	}

	public static void m1() throws InterruptedException {
		m2();
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}
}
