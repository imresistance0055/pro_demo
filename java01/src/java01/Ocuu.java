package java01;

import java.util.HashMap;
import java.util.Map;

public class Ocuu {

	public static void main(String[] args) {

		String str = "Deepak kumar naam hai mera";

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			}

			else {

				map.put(ch, 1);
			}
		}

		System.out.println(map);

	}

}
