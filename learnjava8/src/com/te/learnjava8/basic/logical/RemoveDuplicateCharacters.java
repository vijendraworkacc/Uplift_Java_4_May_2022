package com.te.learnjava8.basic.logical;

import java.util.LinkedHashSet;

/*
 * Java program to remove duplicate characters from a string using 
 * collections framework.
 * 
 * String input = "Hi, this string has duplicate characters!";
 * 
 */
public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String input = "Hi, this string has duplicate characters!";
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < input.length(); i++) {
			linkedHashSet.add(input.charAt(i));
		}
		for (Character character : linkedHashSet) {
			System.out.print(character);
		}
	}
}
