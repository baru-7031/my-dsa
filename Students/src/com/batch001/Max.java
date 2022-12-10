package com.batch001;

public class Max {

	public static void main(String[] args) {

		int[] arr = {6,4,8,12,76,98,2};
		
		int max = Integer.MIN_VALUE;
		
		System.out.println(max);
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		
		System.out.println(max + " max Value");
		
		
	}

}
