package com.te.learnjava8.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class GoLinkedList {
	public static void main(String[] args) {
		LinkedList<Teacher> linkedList = new LinkedList<>();
		linkedList.add(new Teacher(1, "Name01", 54));
		linkedList.add(new Teacher(2, "Name02", 44));
		linkedList.add(new Teacher(3, "Name03", 59));
		linkedList.add(new Teacher(4, "Name04", 50));

		// 1: Just print the linkedList object!
		System.out.println(linkedList);

		System.out.println();
		// 2. Foreach loop!
		for (Teacher teacher : linkedList) {
			System.out.println(teacher);
		}

		System.out.println();
		// 3. Iterator!
		Iterator<Teacher> iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Teacher teacher = iterator.next();
			System.out.println(teacher);
		}

		System.out.println();
		// 4. ListIterator!
		ListIterator<Teacher> listIterator = linkedList.listIterator();
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
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

	}
}
