package interviewCodes;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		//finding the GDC of given two numbers
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		System.out.println("GCD of given numbers: "+findGCD(number1, number2));
		
	}
	
	public static int findGCD(int num1, int num2) {
		if(num2==0) {
			return num1;
		}
		return findGCD(num2,num1%num2);
	}

}
