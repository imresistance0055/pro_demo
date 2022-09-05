package java01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Second_hig {

	public static void main(String[] args) {

		List<emp> list = new ArrayList<>();

		list.add(new emp("deepak", 12987, "patna"));
		list.add(new emp("rahuk", 122987, "goa"));
		list.add(new emp("rohit", 102987, "Delhi"));
		list.add(new emp("kjak", 127, "patna"));
		list.add(new emp("Pankaj", 17, "patna"));

		Optional<Integer> salary = list.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		System.out.println(salary.get());
	}

}
