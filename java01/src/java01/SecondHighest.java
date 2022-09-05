package java01;

import java.util.Arrays;

public class SecondHighest {

	static Integer SecondHighest(Integer[] a, int total) {
		
		Arrays.sort(a);

		return a[total - 2];

	}

	public static void main(String[] args) {

		Integer[] a = { 12, 33, 22, 15, 88, 65, 43 };

		System.out.println(SecondHighest(a, 7));
	}

}
