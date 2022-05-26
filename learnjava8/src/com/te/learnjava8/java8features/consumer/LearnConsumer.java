package com.te.learnjava8.java8features.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LearnConsumer {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1, "Name01", 22));
		students.add(new Student(2, "Name02", 25));
		students.add(new Student(3, "Name03", 24));
		students.add(new Student(4, "Name04", 20));
		students.add(new Student(5, "Name05", 21));
		
		ArrayList<Student> students2 = new ArrayList<>();
		students.add(new Student(1, "Name01", 22));
		students.add(new Student(2, "Name02", 25));
		students.add(new Student(3, "Name03", 24));
		students.add(new Student(4, "Name04", 20));
		students.add(new Student(5, "Name05", 21));
		
		Consumer<Student> consumer = s -> System.out.println(s);
		students.stream().forEach(s -> System.out.println(s));
		System.out.println();
		students2.stream().forEach(consumer);
	}
}
