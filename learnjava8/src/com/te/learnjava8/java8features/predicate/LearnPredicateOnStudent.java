package com.te.learnjava8.java8features.predicate;

import java.util.function.Predicate;

public class LearnPredicateOnStudent {
	public static void main(String[] args) {
		// 1.
		Predicate<Student> predicateOnAge1 = s -> {
			if (s.getStudentAge() <= 20) {
				return true;
			}
			return false;
		};

		// 2.
		Predicate<Student> predicateOnAge2 = s -> {
			return s.getStudentAge() <= 20;
		};

		// 3.
		Predicate<Student> predicateOnAge3 = s -> s.getStudentAge() <= 20;

		// 4.
		Predicate<Student> predicateOnAge4 = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {
				return t.getStudentAge() <= 20;
			}
		};

		System.out.println("Is student age less than 20? " + predicateOnAge1.test(new Student(1, "Supriya", 15)));
		System.out.println("Is student age less than 20? " + predicateOnAge2.test(new Student(1, "Supriya", 15)));
		System.out.println("Is student age less than 20? " + predicateOnAge3.test(new Student(1, "Supriya", 15)));
		System.out.println("Is student age less than 20? " + predicateOnAge4.test(new Student(1, "Supriya", 15)));
	}
}
