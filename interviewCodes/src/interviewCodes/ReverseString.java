package interviewCodes;

public class ReverseString {

	public static void main(String[] args) {
		String name = "RahulSingh";
		String reverse = reverseString(name);
		System.out.println(reverse);
		System.out.println("is the "+name+" palindrome: "+isPalindrome(name,reverse));
	}
	
	public static String reverseString(String name) {
		if(name==null || name.isEmpty()) {
			return name;
		}
		return name.charAt(name.length()-1)+reverseString(name.substring(0, name.length()-1));
	}
	
	public static Boolean isPalindrome(String name, String reverse) {
		if(name.equals(reverse)) {
			return true;
		}
		return false;
	}

}
