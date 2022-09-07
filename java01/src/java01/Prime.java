package java01;

public class Prime {

	public static void main(String[] args) {

		int n = 21;

		boolean value = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				value = false;
			}

		}

		if (value) {
			System.out.println(n + " number is prime");

		}

		else {

			System.out.println("Number is not prime ");
		}

	}
}
