package com.batch001;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		int[] arr = {6,5,43,1,3,6,9,5};
		
		System.out.println("Before Sorting");
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		Arrays.sort(arr);
		System.out.println("\nAfter Sorting");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
}
