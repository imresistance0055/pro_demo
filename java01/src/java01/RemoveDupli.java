package java01;

import java.util.LinkedHashSet;

public class RemoveDupli {

	static void removeDuplicates(String str) {

		LinkedHashSet<Character> set = new LinkedHashSet<>();

		for (int i = 0; i < str.length(); i++)

			set.add(str.charAt(i));

		for (char ch : set)

			System.out.print(ch);

	}

	public static void main(String[] args) {

		String str = "abbcccddddeeeee";

		removeDuplicates(str);

	}

}
