package java01;

public class Add {

	public static void main(String[] args) {

		Integer[] a = { 11, 22 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}

		System.out.println(sum);

	}
}