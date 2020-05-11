package interviewCodes;

public class StringBufferDemo {

	public static void main(String[] args) {
		String name = "Rahul Singh";
		StringBuffer sb1 = new StringBuffer(name);
		StringBuffer sb2 = new StringBuffer(name);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		sb1.append(" Lodhi");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		String afterRevers = sb1.toString();
		System.out.println(afterRevers);
	}

}
