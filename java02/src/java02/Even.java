package java02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Even {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(33,21,21,33,23,54,56,7,4,4);
		
		list.stream().distinct().sorted(Comparator.reverseOrder()).filter(e ->e%2==0).forEach(System.out::println);
		
			}
		}
		