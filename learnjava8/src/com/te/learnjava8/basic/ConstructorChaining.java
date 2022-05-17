package com.te.learnjava8.basic;

class Parent {
	int a;
	int b;

	Parent() {
		super();
		System.out.println("Parent() constructor called!");
	}

	Parent(int a) {
		this();
		this.a = a;
		System.out.println("Parent(int a) constructor called!");
	}

	Parent(int a, int b) {
		this(a);
		this.b = b;
		System.out.println("Parent(int a, int b) constructor called!");
	}
}

class Child extends Parent {
	int c;
	int d;

	Child() {
		super(10, 20);
		System.out.println("Child() constructor called!");
	}

	Child(int c) {
		this();
		this.c = c;
		System.out.println("Child(int c) constructor called!");
	}

	Child(int c, int d) {
		this(c);
		// this.c = c;
		this.d = d;
		System.out.println("Child(int c, int d) constructor called!");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		Child child = new Child(30, 40);
		System.out.println(child.a);
		System.out.println(child.b);
		System.out.println(child.c);
		System.out.println(child.d);
	}
}
