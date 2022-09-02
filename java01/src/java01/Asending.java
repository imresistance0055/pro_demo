package java01;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Asending {

	public static void main(String[] args) {
		
		
		int[] a= {11,76,56,99,34,54,67};
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(a));
	}

}
