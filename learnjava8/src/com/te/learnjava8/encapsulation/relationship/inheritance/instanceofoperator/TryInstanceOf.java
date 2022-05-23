package com.te.learnjava8.encapsulation.relationship.inheritance.instanceofoperator;

class A {
	int a = 10;
}

class B extends A {
	int a = 10;
}

class C extends B {
	int c = 10;
}

class D {
	int d = 10;
}

public class TryInstanceOf {
	public static void main(String[] args) {
		// (Object) instanceof (Type)
		if ((new A()) instanceof C) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
		
		System.out.println((new A()) instanceof C);
	}
}
