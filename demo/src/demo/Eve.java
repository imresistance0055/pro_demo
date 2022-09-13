package demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Eve {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,0,5,0,3);
		
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
	}

}
