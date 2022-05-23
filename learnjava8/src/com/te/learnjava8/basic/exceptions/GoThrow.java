package com.te.learnjava8.basic.exceptions;

import java.util.Scanner;

public class GoThrow {
	public static boolean checkAge(int age) {
		if (age >= 18) {
			return true;
		}
		throw new AgeNotAllowedException("Thoda bade ho jao!");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("If you want to marry, Enter age: ");
		int age = scanner.nextInt();
		if (checkAge(age)) {
			System.out.println("Ha! You are allowed to marry!");
		}
	}
}
