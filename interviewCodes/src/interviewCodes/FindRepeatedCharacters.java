package interviewCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindRepeatedCharacters {

	public static void main(String[] args) {
		String name = "this is the string to be tested for duplicate characters";
		char[] chArr = name.toCharArray();
		List<Character> list = new ArrayList<>();
		for(int i = 0;i<chArr.length-1;i++) {
			list.add(chArr[i]);
		}
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character ch: list) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Character: '"+entry.getKey()+"' is repeated '"+entry.getValue()+"' times.");
			}
		}
		
	}

}
