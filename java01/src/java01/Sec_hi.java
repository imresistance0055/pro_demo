package java01;

import java.util.Arrays;

public class Sec_hi {
	
	
	static Integer secondHighest(int[] a, int total) {
		
		Arrays.sort(a);
		
		return a[total-2];
	}

	public static void main(String[] args) {
		
		
		int[] a= {11,43,98,34,78,67,45};
		
		System.out.println(secondHighest(a, 7));
	}

}
