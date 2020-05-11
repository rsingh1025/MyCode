package interviewCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class repeatedCharacters {

	public static void main(String[] args) {
		String name = "this is the repeated element removal script";
		char[] ch = name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		for (Character charact : ch) {
			if (map.containsKey(charact)) {
				map.put(charact, map.get(charact) + 1);
			} else {
				map.put(charact, 1);
			}
		}
		char[] repeated = new char[map.size() - 1];
		char[] unique = new char[map.size() - 1];
		int i = 0, j = 0;
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Letter '" + entry.getKey() + "' is repeated '" + entry.getValue() + "' times.");
				repeated[i++] = entry.getKey();
			} else if (entry.getValue() == 1) {
				unique[j++] = entry.getKey();
			}
		}

		// Repeated array
		for (int m = 0; m < repeated.length - 1; m++) {
			System.out.print(repeated[m]+" ");
		}
		System.out.println("");
		for (int m = 0; m < repeated.length - 1; m++) {
			System.out.print(unique[m]+" ");
		}
	}

}
