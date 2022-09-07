package java02;

import java.util.Arrays;
import java.util.Collections;

public class Rev {
	
	
	static void reverse(Integer a[]) {
		
		
		Collections.reverse(Arrays.asList(a));
		
		System.out.println(Arrays.asList(a));
		
	}

	public static void main(String[] args) {
		
		
		Integer[] a= {11,22,33,44,23};
		reverse(a);
		
		
		
		
		
		
	}

}
