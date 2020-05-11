package interviewCodes;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		System.out.println("Please enter the string from which you want to remove the characters");
		String string = "wont remove anything from the string";
		char[] cArr = string.toCharArray();
		StringBuilder sb = new StringBuilder();
		int sizeOfArray = cArr.length;
		char[] newcArr = new char[sizeOfArray];
		//int x = 0;
		for (char c : cArr) {
			if(c == 'o') {
				System.out.println("do nothing");
				sb.append('_');
			}
			else {
				sb.append(c);
				System.out.println("added new character");
				//x++;
			}
		}
		String newStringArray = sb.toString().trim();
		//System.out.println(newcArr);
		//String newStringArray = new String(newcArr);
	//	String newStringArray = newcArr.toString().trim();
		
		System.out.println(newStringArray);
	}

}
