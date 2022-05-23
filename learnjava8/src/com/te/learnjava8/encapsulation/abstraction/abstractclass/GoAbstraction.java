package com.te.learnjava8.encapsulation.abstraction.abstractclass;

abstract class A {
	int a;

	{
		a = 10;
		System.out.println("A() non-static intializer executed!");
	}

	A() {
		System.out.println("A() contructor called!");
	}
}

class B extends A {
	int b;

	{
		b = 10;
		System.out.println("B() non-static intializer executed!");
	}

	B() {
		System.out.println("B() contructor called!");
	}
}

public class GoAbstraction {

	public static void main(String[] args) {
		B b = new B();
	}

}