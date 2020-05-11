package interviewCodes;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the number to check if its prime or not");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int sqrtNUmber = (int) Math.sqrt(number)+1;
		System.out.println("Is "+number+" prime or not: "+isPrime(number,sqrtNUmber));
	}
	
	public static String isPrime(int number, int sqrtNUmber) {
		if(number<0) {
			return "invalid entry";
		} if(number ==0 || number==1) {
			return "not prime";
		}if(number ==2 || number == 3) {
			return "is a prime";
		}
		if (number>3){
			for(int i=2;i<=sqrtNUmber;i++) {
				if(number%i==0) {
					return "is not a prime";
				}
				
			}

		}
		return "is a prime number";

	}

}
