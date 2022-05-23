package com.te.learnjava8.encapsulation.relationship.inheritance;

class AA {
	public void m1() {

	}

	public static void m2() {

	}

	public static void main(String[] args) {
		System.out.println("AA class main(...) method!");
	}
}

class BB extends AA {
	@Override
	public void m1() {

	}

	public static void m2() {

	}
	
	public static void main(String[] args) {
		System.out.println("BB class main(...) method!");
	}
}

public class MethodHiding2 extends BB {

}
