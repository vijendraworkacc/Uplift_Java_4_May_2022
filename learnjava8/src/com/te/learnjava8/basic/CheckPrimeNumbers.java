package com.te.learnjava8.basic;

public class CheckPrimeNumbers {
	public static boolean checkPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 32;
		if (checkPrime(num)) {
			System.out.println(num + " is a prime number!");
		} else {
			System.out.println(num + " is not a prime number!");
		}
	}
}
