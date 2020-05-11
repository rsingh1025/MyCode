package interviewCodes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 1535;
		System.out.println("is the number an armstrong number: "+ armStrong(number));
	}
	
	public static Boolean armStrong(int num) {
		int orginalNumber=num;
		int arm=0;
		while(num!=0) {
			int temp = num%10;
			arm = (int) (arm+Math.pow(temp, 3));
			num=num/10;
		}
		System.out.println(arm);
		if(arm==orginalNumber) {
			return true;
		}
		return false;
	}

}
