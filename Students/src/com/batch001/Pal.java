package com.batch001;

public class Pal {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,2,1};
		
		int start =0;
		int end = arr.length - 1;
		boolean found = false;
		while(start <= end) {
			if(arr[start] != arr[end]) 
			{
				found = true;
				break;
			}
			
			start++;
			end--;
		}
		
		if(!found) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}
