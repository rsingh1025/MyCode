package interviewCodes;

import java.util.Scanner;

public class CollectionsFramework {

	public static void main(String[] args) {
		System.out.println("This is practice test again");
		Scanner scan = new Scanner(System.in);
		Boolean choice = true;
		System.out.println("Do you want to enter the number \nYes/No?");
		
		while(choice) {
			String selection = scan.nextLine();
			if(selection.equalsIgnoreCase("Yes")) {
				System.out.println("Enter the numbers you want to add");
				int a = scan.nextInt();
				int b = scan.nextInt();
				System.out.println("Final sum after addition is: "+(a+b));
				System.out.println("Do you want to proceed again\nYes/No?");
			}
			if(selection.equalsIgnoreCase("No")) {
				choice = false;
				System.out.println("You have selected NO to proceed with the execution");
			}
			
		}
	}

}
