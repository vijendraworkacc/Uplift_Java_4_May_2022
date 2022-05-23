package com.te.learnjava8.basic.exceptions;

class A {

}

class B extends A {

}

class C extends B {

}

public class GoException {
	public static void main(String[] args) {
		System.out.println("main(...) start!");
		int a = 10;
		int b = 0;
		int res = 0;
		try {
			System.out.println("Statement before bad statement!");
			A aa = new B();
			C c = (C) aa;
			res = a / b;
			String str = "abcd";
			for (int i = 0; i <= str.length(); i++) {
				System.out.println(str.charAt(i));
			}
			System.out.println("Statement after bad statement!" + res);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occured!");
			System.out.println(e.getMessage());
		} catch (ClassCastException e) {
			System.out.println("ClassCastException occured!");
			System.out.println(e.getMessage());
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException occured!");
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException occured!");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occured!");
			System.out.println(e.getMessage());
		}
		System.out.println("Result is " + res);
		System.out.println("main(...) end!");
	}
}
