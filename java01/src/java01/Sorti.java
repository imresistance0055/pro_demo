package java01;

import java.util.Arrays;

public class Sorti {

	public static void main(String[] args) {

		// input String
		
		String str = "ghdiakidnnaj";
		
		//convert string to char array

		char[] ch = str.toCharArray();
		
		//now sort the array

		Arrays.sort(ch);
		
		//making string to array

		str = new String(ch);

		System.out.println(str);

	}

}
