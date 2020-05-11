package interviewCodes;

public class WrapperClass {

	public static void main(String[] args) {
		
		int x = 100;
		Integer y = Integer.valueOf(x);
		System.out.println(y);
		int z = y.intValue();
		System.out.println(z);
		String s = Integer.toString(x);
		System.out.println(s);
		int l = Integer.parseInt(s);
		System.out.println(l);
		
	}

}
