package com.te.learnjava8.java8features.function;

import java.util.function.Function;

public class LearnFunctionFOrSquare {
	public static void main(String[] args) {
		Function<Integer, Integer> functionForSquare = i -> i * i;
		
		System.out.println("Square of number is? " + functionForSquare.apply(10));
	}
}
