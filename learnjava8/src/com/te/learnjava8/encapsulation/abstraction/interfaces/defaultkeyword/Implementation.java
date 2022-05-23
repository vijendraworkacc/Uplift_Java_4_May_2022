package com.te.learnjava8.encapsulation.abstraction.interfaces.defaultkeyword;

public class Implementation implements Left, Right {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		Right.super.m3();
	}
	
	public static void someStaticMethod() {
		Left.m2();
	}
}
