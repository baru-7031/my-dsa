package com.batch001;

import java.util.Scanner;

public class ChangeValue {

	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[5];
//		
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		
		
		
		int[] arr1 = {1,2,5,3,9,2,1};		// 7 -> 10   / 5 -> 15 	/ 5
		
		
		for(int i =0; i<arr1.length; i++) {
			if(arr1[i] == 2)
				arr1[i] = 9;
			else if(arr1[i] == 9) 
				arr1[i] = 2;
		}
		
		int i=0;
		for(; i<arr1.length ; i++ ) {
			System.out.print(arr1[i] + ",");
		}
		
	}
	
}
