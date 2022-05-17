package com.te.learnjava8.basic;

public class LargestOfFive {
	// [access modifier] [modifier] [return type] [method name]
	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		int c = 2;
		int d = 60;
		int e = 5;

		int res = (a > b && a > c && a > d && a > e) 
				? a : (b > c && b > d && b > e) 
						? b : (c > d && c > e) 
								? c : (d > e) 
										? d : e;

		System.out.println(res + " is the largest!");
	}
}
