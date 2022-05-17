package com.te.learnjava8.basic;

public class StaticIntializerSequence {
	static {
		System.out.println("Static multiline intializer executed!");
		System.out.println("Using static variable a in intializer: " + StaticIntializerSequence.a);
	}

	static int a = 10;

	{
		System.out.println("Non-Static multiline intializer executed!");
		System.out.println("Using non-static variable b in intializer: " + this.b);
	}

	int b = 10;

	public StaticIntializerSequence() {
		// 1. Non-static members of the class gets loaded in the object!
		// 2. Non-static initializers will get executed from top to bottom order!
		// 3. Programmer written instructions will be executed!
		System.out.println("StaticIntializerSequence() contructor called!");
	}

	public StaticIntializerSequence(int a) {
		this();
		// 3. Programmer written instructions will be executed!
		System.out.println("StaticIntializerSequence(int a) contructor called!");
	}

	public static void main(String[] args) {
		System.out.println("main(...) method executed!");
		System.out.println("Using static variable a in main(...): " + StaticIntializerSequence.a);
		StaticIntializerSequence intializerSequence = new StaticIntializerSequence(20);
		System.out.println("Using non-static variable b in main(...): " + intializerSequence.b);
	}
}
