package com.te.learnjava8.basic;

/*
 * Class to just check print() and println() method!
 * 
 * */
public class CheckPrint {

	public void hi() {
		return;
	}
	public static void main(String[] args) {
		System.out.println();
		/*
		 * Will give compile time error because there is no method of print() which
		 * accepts no argument!
		 * 
		 * print() method has only one role 
		 * 
		 * 1. Print
		 * 
		 * println() method has only two roles 
		 * 
		 * 1. Print 2. Go to new line
		 */
		// System.out.print();
	}

}
