package com.te.learnjava8.encapsulation.abstraction.interfaces;

public interface GoInterface  {
	/*
	 * Variables are always final and static, so initialization happens at the time
	 * of class loading and only once!
	 */
	public static final Integer a = 10;

	/*
	 * Abstract method must be overridden in the child class!
	 */
	public abstract void m1();

	/*
	 * Static methods are not inherited in the child class!
	 */
	public static void m2() {
		System.out.println("GoInterface implementation of m2() static method!");
	}
	
	default void m3() {
		System.out.println("GoInterface implementation of m3() default method!");
	}
	
	default void m4() {
		
	}
}
