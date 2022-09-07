package java02;

import java.util.Arrays;
import java.util.List;

public class Adding_java8 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,43,54,65,33,22);
		
		Integer sum=list.stream().reduce(0, Integer::sum);
		
		System.out.println(sum);
		
	}

}
