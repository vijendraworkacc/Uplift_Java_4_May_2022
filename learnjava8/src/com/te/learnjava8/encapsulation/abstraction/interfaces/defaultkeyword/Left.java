package com.te.learnjava8.encapsulation.abstraction.interfaces.defaultkeyword;

public interface Left {
	public final static Integer a = 10;
	
	public abstract void m1();
	
	public static void m2() {
		System.out.println("Left m2() static method!");
	}
	
	default void m3() {
		System.out.println("Left m3() default method!");
	}
}
