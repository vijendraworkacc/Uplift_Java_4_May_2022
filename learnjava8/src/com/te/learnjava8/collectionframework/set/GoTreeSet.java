package com.te.learnjava8.collectionframework.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

import com.te.learnjava8.collectionframework.list.Teacher;

public class GoTreeSet {
	public static void main(String[] args) {
		// Using Comparable!
		TreeSet<Teacher> treeSet = new TreeSet<>();
		treeSet.add(new Teacher(1, "Name01", 54));
		treeSet.add(new Teacher(2, "Name02", 44));
		treeSet.add(new Teacher(3, "Name03", 59));
		treeSet.add(new Teacher(6, "Name06", 54));
		treeSet.add(new Teacher(4, "Name04", 50));

		for (Teacher teacher : treeSet) {
			System.out.println(teacher);
		}

		// Using Comparator!
		System.out.println();
		Comparator<Teacher> comparatorOnAge = (t1, t2) -> {
			return t2.getTeacherAge() - t1.getTeacherAge();
		};
		TreeSet<Teacher> treeSet1 = new TreeSet<>(Collections.reverseOrder());
		treeSet1.add(new Teacher(1, "Name01", 54));
		treeSet1.add(new Teacher(2, "Name02", 44));
		treeSet1.add(new Teacher(3, "Name03", 59));
		treeSet1.add(new Teacher(6, "Name06", 54));
		treeSet1.add(new Teacher(4, "Name04", 50));

		for (Teacher teacher : treeSet1) {
			System.out.println(teacher);
		}

	}
}
