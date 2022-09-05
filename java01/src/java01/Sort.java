package java01;

import java.util.Arrays;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		
		
		List<Integer> list=Arrays.asList(22,33,22,33,87,45,32);
		
		
		//even Number without Duplication with sorting order
		
		list.stream().distinct().sorted().filter(e->e%2==0).forEach(System.out::println);
	}

}
