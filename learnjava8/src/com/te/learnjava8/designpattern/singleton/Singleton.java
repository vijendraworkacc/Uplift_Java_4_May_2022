package com.te.learnjava8.designpattern.singleton;

public class Singleton {
	private final static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getSingleSingletonOb() {
		return singleton;
	}
}
