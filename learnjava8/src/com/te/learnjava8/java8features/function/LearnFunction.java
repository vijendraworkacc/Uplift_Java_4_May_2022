package com.te.learnjava8.java8features.function;

import java.util.function.Function;

public class LearnFunction {
	public static void main(String[] args) {
		Function<Student, Boolean> function = s -> {
			return s.getStudentAge() < 25;
		};

		System.out.println("Is student age less than 25? " + function.apply(new Student(1, "Name01", 22)));
	}
}
