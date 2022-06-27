package com.te.junittraining;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.te.junittraining.logic.StringUtils;

/* Test class */
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Testing StringUtils class")
public class StringUtilsTest {

	private static StringUtils stringUtils;

	@BeforeAll
	public static void startUp() {
		stringUtils = new StringUtils();
	}

	@AfterAll
	public static void cleanUp() {
		stringUtils = null;
	}

	@BeforeEach
	public void startUpBeforeEachTestCase() {
		// Some operation
	}

	@AfterEach
	public void cleanUpAfterEachTestCase() {
		// Some operation
	}

	/* Test case */
	@Order(33)
	@DisplayName("reverse() method on basic string")
	@Test
	public void reverse_basicString() {
		String actual = stringUtils.reverse("Hello");
		String expected = "olleH";
		assertEquals(expected, actual);
	}

	@Order(36)
	@DisplayName("reverse() method on empty string")
	@Test
	public void reverse_emptyString() {
		String actual = stringUtils.reverse("");
		String expected = "";
		assertEquals(expected, actual);
	}

	@Order(43)
	@DisplayName("reverse() method on string with spaces")
	@Test
	public void reverse_stringWithSpace() {
		String actual = stringUtils.reverse("Hi Hello");
		String expected = "olleH iH";
		assertEquals(expected, actual);
	}

	@Order(44)
	@RepeatedTest(value = 5, name = "==> {currentRepetition}/{totalRepetitions}")
	@DisplayName("reverse() method on repeated test")
	@Test
	public void reverse_repeated() {
		String actual = stringUtils.reverse("Hi Hello");
		String expected = "olleH iH";
		assertEquals(expected, actual);
	}

	@Order(10)
	@DisplayName("findStringLength() method on basic string")
	@Test
	public void findStringLength_basicString() {
		int actual = stringUtils.findStringLength("Hello");
		int expected = 5;
		assertEquals(expected, actual);
	}

	@Order(11)
	@DisplayName("findStringLength() method on empty string")
	@Test
	public void findStringLength_emptyString() {
		int actual = stringUtils.findStringLength("");
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Order(15)
	@DisplayName("findStringLength() method on string with spaces")
	@Test
	public void findStringLength_stringWithSpace() {
		int actual = stringUtils.findStringLength("Hello Hi");
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	@Order(77)
	@DisplayName("palindrome() method on non palindrome string")
	@Test
	public void palindrome_nonPalindromeString() {
		boolean actual = stringUtils.palindrome("Hello");
		assertFalse(actual);
	}

}
