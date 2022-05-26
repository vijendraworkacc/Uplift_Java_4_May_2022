package com.te.learnjava8.java8features.predicate;

import java.util.function.Predicate;

public class LearnPredicateOnStudentName {
	public static void main(String[] args) {
	
		Predicate<Student> predicateOnName = s -> s.getStudentName().length() >= 5;

		System.out.println("Is student name length more than 5? " + predicateOnName.test(new Student(1, "Supriya", 15)));
	}
}
