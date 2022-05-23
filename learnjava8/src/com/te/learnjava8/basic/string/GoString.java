package com.te.learnjava8.basic.string;

public class GoString {
	public static void main(String[] args) {
		/*
		 * String string1 = "Hello"; ==> This line created an object in String Constant
		 * Pool, because we are making use of a string literal.
		 * 
		 * String string2 = new String("Hello"); ==> This line will create a new object
		 * in Heap Area because we are making use of new keyword. And to create the new
		 * object we are using string literal "Hello", and so a new memory block will
		 * not be created in the String Constant Pool, instead same memory block will be
		 * reused.
		 * 
		 * string1.toLowerCase(); string2.toUpperCase(); ==> Both the above statements
		 * will create new objects in the heap area respectively with one String object
		 * with all lower-case characters and the other with all upper-case characters.
		 */
		String string1 = "Hello";
		String string2 = new String("Hello");
		string1.toLowerCase();
		string2.toUpperCase();
		System.out.println(string1);
		System.out.println(string2);
	}
}
