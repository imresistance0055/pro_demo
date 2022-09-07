package java01;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {

		String str1 = "abcde";

		String str2 = "acdebq";

		if (str1.length() == str2.length()) {

			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean result = Arrays.equals(ch1, ch2);

			if (result) {

				System.out.println(str1 + " and " + str2 + " is a Anagram");
			}

			else {

				System.out.println(str1 + " and " + str2 + " is Not a Anagram");

			}

		} else {

			System.out.println(str1 + " and " + str2 + " is Not a Anagram");
		}
	}
}
