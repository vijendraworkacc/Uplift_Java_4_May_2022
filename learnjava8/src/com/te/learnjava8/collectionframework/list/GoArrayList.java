package com.te.learnjava8.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class GoArrayList {
	public static void main(String[] args) {
		List<Teacher> arrayList = new ArrayList<>();
		arrayList.add(new Teacher(1, "Name01", 54));
		arrayList.add(new Teacher(2, "Name02", 44));
		arrayList.add(new Teacher(3, "Name03", 59));
		arrayList.add(new Teacher(4, "Name04", 50));

		// 1: Just print the ArrayList object!
		System.out.println(arrayList);

		System.out.println();
		// 2. Foreach loop!
		for (Teacher teacher : arrayList) {
			System.out.println(teacher);
		}

		System.out.println();
		// 3. Iterator!
		Iterator<Teacher> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Teacher teacher = iterator.next();
			System.out.println(teacher);
		}

		System.out.println();
		// 4. ListIterator!
		ListIterator<Teacher> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Teacher teacher = listIterator.next();
			System.out.println(teacher);
		}
		System.out.println();
		while (listIterator.hasPrevious()) {
			Teacher teacher = listIterator.previous();
			System.out.println(teacher);
		}
		
		System.out.println();
		// 5. for loop!
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
