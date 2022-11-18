/**
 * 
 */
package com.trainingdojo;

/**
 * @author 4chri
 *
 */
public class InterveningVerbiage {

	public int countWordsBetween(String firstWord, String secondWord, String message) {
		// 1. Split string into array of strings delimited by spaces.
		String[] arr = message.split(" ");

		// 2. Look up index of starting word
		int firstIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equalsIgnoreCase(firstWord)) {
				firstIndex = i;
				break;
			}
		}
		
		if (firstIndex == -1)
			return -1;

		// 3. Store index of the second word starting at the first
		int secondIndex = -1;

		for (int i = firstIndex + 1; i < arr.length; i++) {
			if (arr[i].equals(secondWord)) {
				secondIndex = i;
				break;
			}
		}

		if (secondIndex == -1)
			return -1;
		
		// return the difference
		return secondIndex - firstIndex - 1;
	}

}
