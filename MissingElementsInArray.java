package week2.day2;

import java.util.Arrays;

public class MissingElementsInArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
	/*	for(int b=0;b<arr.length-1;b++)
			System.out.println(arr[b]);*/
		int j=1;
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=j)	
			{
				System.out.println(j);
				break;
			}
			j++;
		}
		
		
	}

}
