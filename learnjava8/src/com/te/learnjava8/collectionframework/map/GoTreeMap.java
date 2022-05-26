package com.te.learnjava8.collectionframework.map;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class GoTreeMap {
	public static void main(String[] args) {
		Comparator<Student> comparatorStudentAge = (s1, s2) -> {
			return s1.getStudentAge() - s2.getStudentAge();
		};
		TreeMap<Student, SubjectMarks> studentPercentage = new TreeMap<>(comparatorStudentAge);
		studentPercentage.put(new Student(1, 5, "Name01", Standard.SECOND), new SubjectMarks("Subject01", 55));
		studentPercentage.put(new Student(2, 4, "Name02", Standard.FIFTH), new SubjectMarks("Subject03", 51));
		studentPercentage.put(new Student(3, 6, "Name03", Standard.FOURTH), new SubjectMarks("Subject01", 45));
		studentPercentage.put(new Student(4, 7, "Name04", Standard.FIFTH), new SubjectMarks("Subject06", 78));
		studentPercentage.put(new Student(1, 5, "Name01", Standard.SECOND), new SubjectMarks("Subject08", 66));

		// 1. Just print it!
		System.out.println(studentPercentage);

		// 2. foreach loop!
		System.out.println();
		for (Entry<Student, SubjectMarks> entry : studentPercentage.entrySet()) {
			Student student = entry.getKey();
			SubjectMarks subjectMarks = entry.getValue();
			System.out.println(student + ": " + subjectMarks);
		}
	}
}
