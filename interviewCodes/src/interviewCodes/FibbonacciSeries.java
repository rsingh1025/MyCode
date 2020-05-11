package interviewCodes;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		/*
		 * int x = 1; int y = 1; int z; System.out.print(x + " " + y + " "); for (int k
		 * = 3; k <= 10; k++) { z = x + y; System.out.print(z+" "); x = y; y = z; }
		 */

		/*
		//Recursion
		 * Scanner scan = new Scanner(System.in); int number = scan.nextInt();
		 * 
		 * for (int i = 1; i <= number; i++) { System.out.print(fibo(i)+"  "); } }
		 * 
		 * public static int fibo(int n) { if(n==1 || n==2) { return 1; } else { return
		 * fibo(n-1)+fibo(n-2); } }
		 * 
		 */
		
		Scanner scan = new Scanner(System.in); 
		int number = scan.nextInt();
		for(int k=1; k<=number;k++) {
			System.out.print(fibo(k)+" ");
		}
	}
	
	public static int fibo(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			int fib1 = 1, fib2=1,fib=1;
			for(int l=3;l<=n;l++) {
				fib = fib1+fib2;
				fib1=fib2;
				fib2=fib;
			}
			return fib;
		}
	}

}
