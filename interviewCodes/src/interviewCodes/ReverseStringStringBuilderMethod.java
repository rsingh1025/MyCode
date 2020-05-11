package interviewCodes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringStringBuilderMethod {

	public static void main(String[] args) {
		String name = "Rahul Singh Lodhi";
		List<String> list = Arrays.asList(name.split("\\s"));
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		StringBuilder sb = new StringBuilder(name.length());
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
			sb.append(" ");
		}
		String after = sb.toString().trim();
		System.out.println(after);
	}

}
