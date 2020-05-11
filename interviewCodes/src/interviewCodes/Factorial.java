package interviewCodes;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of number 10 is: "+fact(num));
	}

	public static int fact(int number) {
		if(number==0 || number ==1) {
			return number;
		}
		else
			return number*fact(number-1);
	}
	
}
