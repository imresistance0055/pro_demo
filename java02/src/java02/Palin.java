package java02;

public class Palin {

	public static void main(String[] args) {

		String str = "";

		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		if (str.toLowerCase().equals(rev.toLowerCase())) {

			System.out.println(str + " is palindrome");
		} else {

			System.out.println(str + " is not palindrome");

		}
	}

}
