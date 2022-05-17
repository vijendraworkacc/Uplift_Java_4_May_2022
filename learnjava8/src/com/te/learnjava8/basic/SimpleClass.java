package com.te.learnjava8.basic;

public class SimpleClass {

	int a = 10; // Non-static single line initializer
	int b;
	{
		// Non-static multi-line initializer
		b = 20;
		int c = 30;
		System.out.println("Non-static multi-line initializer executed!");

	}

	static int d = 10; // Static single line initializer
	static int e;
	static {
		// Static multi-line initializer
		e = 20;
		int f = 30;
		System.out.println("Static multi-line initializer executed!");

	}

	public void m1() {
		System.out.println("Non-static method called!");
	}

	public static void m2() {
		System.out.println("Static method called!");
	}

	public SimpleClass() {
		System.out.println("SimpleClass() constructor called!");
	}

	public static void main(String[] args) {
		System.out.println("main(...) method called!");
		SimpleClass class1 = new SimpleClass();
	}
}
