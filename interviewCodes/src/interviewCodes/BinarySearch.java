package interviewCodes;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,3,2,5,6,3,7,8,9,7,5,11,23,4,52,335,6,4};
		int find = 11;
		Arrays.sort(arr);
		int low=0;
		int high = arr.length-1;
		
		while(high>=low) {
			int mid=(low+high)/2;
			if(arr[mid]==find) {
				System.out.println("element found at index "+mid);
				break;
			} else if(arr[mid]>find) {
				high=mid-1;
			}else
				low=mid+1;
		}
	}

}
