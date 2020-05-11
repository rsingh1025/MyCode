package interviewCodes;

import java.util.Arrays;
import java.util.List;

public class DuplicateCharacterString {

	public static void main(String[] args) {
		String name = "this is the string to be tested for duplicate characters";
		List<String> list = Arrays.asList(name.split("\\s"));
		int size = list.size();
		System.out.println(list);
		StringBuilder sb = new StringBuilder(size-1);
		for(int i=size-1;i>=0;i--) {
			sb.append(list.get(i));
			sb.append(" ");
		}
		String afterReverseWord = sb.toString().trim();
		System.out.println(afterReverseWord);
	}

}
