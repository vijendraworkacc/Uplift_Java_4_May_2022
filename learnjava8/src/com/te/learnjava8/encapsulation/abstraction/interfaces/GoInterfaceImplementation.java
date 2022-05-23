package com.te.learnjava8.encapsulation.abstraction.interfaces;

public class GoInterfaceImplementation implements GoInterface {

	@Override
	public void m3() {
		System.out.println("GoInterfaceImplementation m3() method!");
	}

	/*
	 * Overriding a default method! (OPTIONAL)
	 */
	@Override
	public void m1() {
		
	}

}
