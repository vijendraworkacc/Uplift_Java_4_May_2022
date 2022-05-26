package com.te.learnjava8.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class GoLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<Student, SubjectMarks> studentPercentage = new LinkedHashMap<>();
		studentPercentage.put(new Student(1, 5, "Name01", Standard.SECOND), new SubjectMarks("Subject01", 55));
		studentPercentage.put(new Student(2, 4, "Name02", Standard.FIFTH), new SubjectMarks("Subject03", 51));
		studentPercentage.put(new Student(3, 6, "Name03", Standard.FOURTH), new SubjectMarks("Subject01", 45));
		studentPercentage.put(new Student(4, 7, "Name04", Standard.FIFTH), new SubjectMarks("Subject06", 78));
		studentPercentage.put(new Student(5, 4, "Name05", Standard.THIRD), new SubjectMarks("Subject08", 66));
		
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
