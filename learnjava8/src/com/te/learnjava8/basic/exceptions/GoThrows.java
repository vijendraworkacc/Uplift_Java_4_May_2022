package com.te.learnjava8.basic.exceptions;

import java.util.Scanner;

public class GoThrows {
	public static boolean checkAge(int age) throws AgeNotAllowedException2 {
		if (age >= 18) {
			return true;
		}
		throw new AgeNotAllowedException2("Thoda bade ho jao!");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("If you want to marry, Enter age: ");
		int age = scanner.nextInt();
		try {
			if (checkAge(age)) {
				System.out.println("Ha! You are allowed to marry!");
			}
		} catch (Exception e) {
			System.out.println("...");
		}
	}
}
