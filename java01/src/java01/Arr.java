package java01;

import java.util.Arrays;

public class Arr {

	public static void main(String[] args) {
		
		String str="deepakkumar";
		
		char[] ch=str.toCharArray();
		
		Arrays.sort(ch);
		
		str=new String(ch);
		
		
		System.out.println(str);
	}

}
