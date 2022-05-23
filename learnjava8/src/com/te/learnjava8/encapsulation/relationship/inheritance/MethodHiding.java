package com.te.learnjava8.encapsulation.relationship.inheritance;

/* 
 * When in the parent class and the child class we have static methods 
 * with same method signature, then the parent class static method the 
 * hidden for the child class.
 * 
 * This phenomena is called Method Hiding/ Shadowing!
 * 
 * */
class A {
	public void m1() {
		System.out.println("A class m1() method!");
	}

	public static void m2() {
		System.out.println("A class m2() static method!");
	}
}

class B extends A {
	@Override
	public void m1() {
		System.out.println("B class m1() method!");
	}

	public static void m2() {
		System.out.println("B class m2() static method!");
	}
}

public class MethodHiding {
	public static void main(String[] args) {
		B b = new B();
		b.m2();
	}
}
