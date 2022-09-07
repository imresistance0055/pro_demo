package java01;

public class Prim {

	public static void main(String[] args) {

		int n = 10;

		boolean value = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				value = false;
			}
		}

		if (value) {

			System.out.println(n + " is a prime Number");
		} else {

			System.out.println("Number is not prime");
		}
	}

}
