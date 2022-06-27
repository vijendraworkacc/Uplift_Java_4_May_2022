package com.te.junittraining.logic;

public class StringUtils {
	public String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

	public int findStringLength(String str) {
		return str.length();
	}

	public String stringConcatenate(String s1, String s2) {
		return s1 + s2;
	}

	public boolean palindrome(String str) {
		if (str.equalsIgnoreCase(reverse(str))) {
			return true;
		}
		return false;
	}
}