package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Dem {

	public static void main(String[] args) {

		String str = "deepak";

		char [] ch=str.toCharArray();
		
		
		Arrays.sort(ch);
		
		str=new String(ch);
		
		System.out.println(str);
		
		
		
	}

}
