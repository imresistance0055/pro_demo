package java01;

public class Even_num {

	public static void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 45, 34 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}

		System.out.println(sum);

	}

}
