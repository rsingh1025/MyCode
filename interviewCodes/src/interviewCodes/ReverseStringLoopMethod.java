package interviewCodes;

public class ReverseStringLoopMethod {

	public static void main(String[] args) {
		String name = "Rahul Singh Lodhi";
		char[] words = name.toCharArray();
		int size = words.length;
		int loopTill = size/2;
		for(int i=0;i<loopTill;i++) {
			char temp = words[i];
			char ltemp = words[size-1-i];
			words[size-1-i] = temp;
			words[i]=ltemp;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(words[i]+" ");
		}
	}

}
