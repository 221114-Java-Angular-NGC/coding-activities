package palindrome;

import java.util.Collection;
import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {

		String test = "carraces";

		boolean result = canMakePalindrome(test);

		System.out.println(String.format("Can %s make a palindrome? Answer: %b", test, result));

	}

	/**
	 * Returns true if a palindrome can be made from the given string.
	 * 
	 * @param str The given string.
	 * @return whether the given string can make a palindrome.
	 */
	private static boolean canMakePalindrome(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		// get the length of the string
		int length = str.length();

		// convert string to lowercase
		str = str.toLowerCase();

		// map each character in the string
		for (char c : str.toCharArray()) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}

		// initalize potentially odd/even boolean
		boolean isOdd = false;

		// convert map val
		Collection<Integer> collectionValues = map.values();

		for (int i : collectionValues) {

			// if int is odd
			if (i % 2 != 0) {
				if (isOdd) {
					return false;
				} else {
					isOdd = true;
				}
			}

		}

		if (length % 2 == 0) {
			return !isOdd;
		} else {
			return true;
		}

	}

}
