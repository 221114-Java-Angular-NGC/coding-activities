/**
 * 
 */
package com.trainingdojo;

/**
 * @author 4chri
 *
 */
public class Driver {

	/**
	 * @param args
	 */

	public static InterveningVerbiage iv = new InterveningVerbiage();

	public static void main(String[] args) {

		String message = "There was an old lady who lived in an outhouse";
		String firstWord = "an";
		String lastWord = "an";

		int result = iv.countWordsBetween(firstWord, lastWord, message);

		if (result == -1) {
			System.out.println("Something went horribly wrong.");
		} else {

			System.out.println("The number of words between " + firstWord + " and " + lastWord + " is " + result + ".");
		}
	}

}
