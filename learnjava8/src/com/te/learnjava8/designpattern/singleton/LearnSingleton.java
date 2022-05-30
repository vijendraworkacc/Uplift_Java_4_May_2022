package com.te.learnjava8.designpattern.singleton;

public class LearnSingleton {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getSingleSingletonOb();
		System.out.println(singleton);
		Singleton singleton1 = Singleton.getSingleSingletonOb();
		System.out.println(singleton1);
		Singleton singleton2 = Singleton.getSingleSingletonOb();
		System.out.println(singleton2);
	}
}
