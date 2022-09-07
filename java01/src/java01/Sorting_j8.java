package java01;

import java.util.ArrayList;
import java.util.List;

public class Sorting_j8 {

	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		
		
		list.add("D");
		list.add("A");
		list.add("R");
		list.add("B");
		list.add("C");
		list.add("V");
		
		
		
		list.stream().distinct().sorted().forEach(System.out::println);

	}

}
