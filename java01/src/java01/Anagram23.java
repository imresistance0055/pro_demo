package java01;

import java.util.Arrays;

public class Anagram23 {

	public static void main(String[] args) {

		String str1 = "abc";

		String str2 = "cba";

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {

			char[] ch1 = str1.toCharArray();

			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			boolean result = Arrays.equals(ch1, ch2);

			if (result) {

				System.out.println(str1 + " and " + str2 + " is Anagram");

			} else {

				System.out.println(str1 + " and " + str2 + " is not Anagram");
			}

		} else {
			System.out.println(str1 + " and " + str2 + " is not Anagram");

		}
	}
}
