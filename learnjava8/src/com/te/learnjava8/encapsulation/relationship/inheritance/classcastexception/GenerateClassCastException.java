package com.te.learnjava8.encapsulation.relationship.inheritance.classcastexception;

class A {
	int a = 10;
}

class B extends A {
	int b = 10;
}

class C extends B {
	int c = 10;
}

public class GenerateClassCastException {
	public static void main(String[] args) {
		/*
		 * A <-- B <-- C
		 * 
		 * When we created an object of class B. Class B object will know about the
		 * (members of class B) + (members of class A) Class B object does not know
		 * about the members of class C.
		 * 
		 * A a = new B(); ==> For this line of code everything works fine because we are
		 * performing up-casting!.
		 * 
		 * C c = (C) a; ==> For this line of code we get ClassCastException, because a
		 * reference variable is pointing to the object of class B. And B object only
		 * knows about the members of class A and B. When we try to downcast object of B
		 * to C type, we realize that B object does not know about the members of C
		 * class. And when situation like this happens we get ClassCastException!
		 * 
		 */
		A a = new B();
		C c = (C) a;
	}
}
