package com.te.learnjava8.basic;

public class StackAreaDemo {

	public StackAreaDemo() {
		System.out.println("StackAreaDemo()!");
		m1();
	}

	public void m1() {
		System.out.println("m1()!");
		m2();
	}

	public void m2() {
		System.out.println("m2()!");
	}

	public static void main(String[] args) {
		System.out.println("main(...)!");
		StackAreaDemo areaDemo = new StackAreaDemo();
	}
}
