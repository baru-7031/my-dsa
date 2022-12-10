package com.batch001;

public class ArraysCon {
	public static void main(String[] args) {
		
		int[] arr = new int[10];	// primitive type
		
		Integer[] intArr = new Integer[10];		// non primitive
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+10;
			
			intArr[i] = i+20;
			
		}
		
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("arr is " + arr[i]);
			System.out.println("intArr is " + intArr[i]);
		}
		
	}
}










