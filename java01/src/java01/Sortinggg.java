package java01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sortinggg {

	public static void main(String[] args) {
	
		List<Integer> list=Arrays.asList(44,65,12,32,98,78);
		
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
	}

}
