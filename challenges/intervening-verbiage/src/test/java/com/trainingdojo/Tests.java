package com.trainingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author 4chri
 *
 */
public class Tests {

	private static InterveningVerbiage iv;
	private static String msg;

	@BeforeAll
	public static void doThisFirst() {
		iv = new InterveningVerbiage();
		msg = "There was an old lady who lived in an outhouse";
	}

	@Test
	public void countBetweenWordsTest() {

		// arrange
		String firstWord = "lady";
		String secondWord = "outhouse";

		// act
		int result = iv.countWordsBetween(firstWord, secondWord, msg);

		// assert
		assertEquals(4, result);

	}

	@Test
	public void countBetweenDuplicateWords() {

		// arrange
		String firstWord = "an";
		String secondWord = "an";

		// act
		int result = iv.countWordsBetween(firstWord, secondWord, msg);

		// assert
		assertEquals(5, result);

	}

	@Test
	public void slewOfTests() {
		// Test cases

		String list_of_words = "There was an old lady who lived in an outhouse";
		assertEquals(4, iv.countWordsBetween("lady", "outhouse", list_of_words));
		assertEquals(6, iv.countWordsBetween("an", "outhouse", list_of_words));
		// Duplicate first string
		list_of_words = "There lady was an old lady who an lady lived in an outhouse";
		assertEquals(10, iv.countWordsBetween("lady", "outhouse", list_of_words));
		assertEquals(8, iv.countWordsBetween("an", "outhouse", list_of_words));//

		// Duplicate last string
		list_of_words = "There lady was an old lady who an lady lived in an outhouse outhouse random sentence outhouse you";
		assertEquals(10, iv.countWordsBetween("lady", "outhouse", list_of_words));
		assertEquals(8, iv.countWordsBetween("an", "outhouse", list_of_words));

		// Two words
		list_of_words = "Hello world";
		assertEquals(0, iv.countWordsBetween("hello", "world", list_of_words));

		// reversed
		assertEquals(-1, iv.countWordsBetween("world", "hello", list_of_words));

		list_of_words = "Hello world";
		assertEquals(0, iv.countWordsBetween("hello", "world", list_of_words));

		// duplicate and reverse
		list_of_words = "There lady was an old lady who an lady lived in an outhouse hello outhouse";
		assertEquals(-1, iv.countWordsBetween("outhouse", "lady", list_of_words));

	}

}
