package com.te.learnjava8.basic.wrapper;

public class GoWrapper {
	public static void main(String[] args) {
		int a = 123;
		
		/* 1. Integer.valueOf(int) */
		// Boxing
		Integer integer = Integer.valueOf(a);
		System.out.println(integer);

		/* 2. new Integer(int) */
		Integer integer2 = new Integer(a);
		System.out.println(integer2);

		/* 3. Integer.valueOf(String) */
		Integer integer3 = Integer.valueOf("123");
		System.out.println(integer3);

		/* new Integer("123") */
		Integer integer4 = new Integer("123");
		System.out.println(integer4);

		/* Integer.parseInt("123") */
		int integer5 = Integer.parseInt("123");
		System.out.println(integer5);
		
		/* integer5.intValue() */
		// Unboxing
		int intValue = integer4.intValue();
		System.out.println(intValue);
		byte byteValue = integer4.byteValue();
		System.out.println(byteValue);
		
		/* Auto-boxing */
		Integer integer6 = a;
		System.out.println(integer6);
		
		/* Auto-unboxing */
		int b = integer6;
		System.out.println(b);
		
		/* Addition */
		// Auto-boxing = Auto-unboxing + Auto-unboxing 
		Integer integer7 = integer3 + integer4;
		System.out.println(integer7);
		
		Boolean boolean1 = Boolean.parseBoolean("FALSE");
		System.out.println(boolean1);
		
	}
}
