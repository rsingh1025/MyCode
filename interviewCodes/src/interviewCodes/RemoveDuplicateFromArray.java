package interviewCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 6, 1, 5, 3, 4, 9, 6, 6 };
		/*
		 * List<Integer> list = new ArrayList<>(); for(int i=0;i<array.length-1;i++) {
		 * list.add(array[i]); }
		 * 
		 * Set<Integer> newSet = new HashSet<>(list); System.out.println(newSet);
		 */
		//Arrays.sort(arr);
		int size = arr.length;
		int temp;
		int counter,k=0;
		int[] brr = new int[size-1];
		for(int i=0;i<size;i++) {
			temp = arr[i];
			counter=0;
			System.out.println("inside outer loop: "+temp);
			for(int j=i+1;j<size;j++) {
				System.out.println("arr[j]: "+arr[j]);
				if(arr[j]==temp) {
					counter = counter+1;
					System.out.println("counter Value: "+counter);
				}
			}
			if(counter==0) {
				System.out.println(" value to be inserted: "+temp);
				brr[k++]=temp;
			}
		}
		for(int a=0;a<brr.length;a++) {
			System.out.println(brr[a]);
		}
	}
}
