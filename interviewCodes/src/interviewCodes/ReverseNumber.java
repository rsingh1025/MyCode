package interviewCodes;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123456;
		int reverse = reverse(number);
		System.out.println("reverse of a number: " + reverse);
	}

	public static int reverse(int number) {
		int reversed=0;
		while(number!=0) {
			int digit = number%10;
			reversed = reversed*10+digit;
			number=number/10;
		}
		return reversed;
		}
	}
