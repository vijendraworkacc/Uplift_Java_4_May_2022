package com.te.learnjava8.java8features.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LearnLocalDateTime {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(1999, 07, 01));
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.of(1999, 07, 01, 23, 59));
	}
}
