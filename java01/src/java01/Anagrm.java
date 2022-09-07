package java01;

import java.util.Arrays;

public class Anagrm {

	public static void main(String[] args) {

		String str1 = "Race";

		String str2 = "Care";

		// check if length is same
		str1 = str1.toLowerCase();

		str2 = str2.toLowerCase();

		// convert strings to char array

		if (str1.length() == str2.length()) {

			char[] ch1 = str1.toCharArray();

			char[] ch2 = str2.toCharArray();

			// sort the char array
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			// if sorted char arrays are same
			// then the string is anagram

			boolean result = Arrays.equals(ch1, ch2);

			if (result) {

				System.out.println(str1 + " and " + str2 + " are Anagram");
			}

			else {

				System.out.println(str1 + " and " + str2 + " are  notAnagram");
			}
		}

		else {
			System.out.println(str1 + " and " + str2 + " are  notAnagram");

		}
	}
}
