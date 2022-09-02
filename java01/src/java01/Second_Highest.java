package java01;

import java.util.Arrays;

public class Second_Highest {

	static Integer secondHighest(int[] a, int total) {

		Arrays.sort(a);

		return a[total - 2];
	}

	public static void main(String[] args) {

		int[] a = { 12, 44, 99, 54, 987, 456, 432, 657 };
		
		
		System.out.println(secondHighest(a, 8));

	}
}