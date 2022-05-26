package com.te.learnjava8.java8features.predicate;

import java.util.function.Predicate;

public class LearnPredicate {
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> {
			return i % 2 == 0;
		};
		System.out.println("Is 10 Even? " + predicate.test(10));
		System.out.println("Is 11 Even? " + predicate.test(11));
	}
}
