package java01;

import java.util.Arrays;
import java.util.List;

public class Add1 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(22,33,44,12,4365);
		
	//	list.stream().sorted().filter(e -> e%2==0).distinct().forEach(System.out::println);
		
		Integer sum=list.stream().reduce(0, Integer::sum);
		
		System.out.println(sum);
	}

}
