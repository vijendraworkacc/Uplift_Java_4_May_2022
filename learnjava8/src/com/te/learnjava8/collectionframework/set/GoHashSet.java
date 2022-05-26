package com.te.learnjava8.collectionframework.set;

import java.util.HashSet;

import com.te.learnjava8.collectionframework.list.Teacher;

public class GoHashSet {
	public static void main(String[] args) {
		HashSet<Teacher> hashSet = new HashSet<>();
		hashSet.add(new Teacher(1, "Name01", 54));
		hashSet.add(new Teacher(2, "Name02", 44));
		hashSet.add(new Teacher(3, "Name03", 59));
		hashSet.add(new Teacher(1, "Name01", 54));
		hashSet.add(new Teacher(4, "Name04", 50));

		for (Teacher teacher : hashSet) {
			System.out.println(teacher);
		}
	}
}
