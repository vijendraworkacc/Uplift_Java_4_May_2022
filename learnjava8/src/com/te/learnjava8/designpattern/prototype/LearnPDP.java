package com.te.learnjava8.designpattern.prototype;

public class LearnPDP {
	public static void main(String[] args) {
		Complex complex = new Complex(1, 3, 21, 6789, 89, 234);
		System.out.println(complex);
		try {
			Complex clone = (Complex) complex.clone();
			System.out.println(clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
