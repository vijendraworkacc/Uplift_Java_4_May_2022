package com.te.learnjava8.encapsulation.abstraction.interfaces.comparable;

import java.util.Arrays;

public class GoArrays {
	public static void main(String[] args) {
		PersonComparable[] persons = { new PersonComparable(1, "Name01", 22), 
				new PersonComparable(2, "Name02", 19), 
				new PersonComparable(3, "Name03", 28),
				new PersonComparable(4, "Name04", 25), 
				new PersonComparable(5, "Name05", 19) };

		Arrays.sort(persons);

		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
