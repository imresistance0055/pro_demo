package java01;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Sortingg {

	static void removeDuplicates(String str) {

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++)

			set.add(str.charAt(i));

		for (char ch : set)

			System.out.print(ch);

	}

	public static void main(String[] args) {

		String str = "deepakkumar";

		char[] ch = str.toCharArray();

		Arrays.sort(ch);

		String str1 = new String(ch);

		System.out.println(str1);

	}

}
