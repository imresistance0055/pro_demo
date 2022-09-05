package java01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AddOdd_j8 {

	public static void main(String[] args) {
		
		
		
		List<Integer> list=Arrays.asList(23,43,45,65,65,75,23,11,11,22,33);
		
		
		
		list.stream().sorted(Comparator.reverseOrder()).filter(e-> e%2!=0).distinct().forEach(System.out::println);
	
		
		
	}

}
