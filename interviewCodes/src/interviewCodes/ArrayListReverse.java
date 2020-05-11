package interviewCodes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReverse {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			list.add(i+12);
		}
		
		System.out.println(list);
		
		for(int i=0;i<(list.size()/2);i++) {
			int stemp= list.get(i);
			int temp = list.get(9-i);
			list.set(i, temp);
			list.set(9-i, stemp);
		}
		
		System.out.println("list after replacing : "+list);
		int repl = list.get(5);
		System.out.println(repl);
		list.remove(5);
		System.out.println(list);
	}

}
