package com.batch001;

public class ArrayPrac {

	public static void main(String[] args) {
		
		int[] store = new int[11];
		
//		value store 
		for(int i =0; i<=10 ; i++ ) {
			store[i] = i*i;
		}

		for(int i =0; i<=10; i++) {
			System.out.println(store[i]);
		}
		
		
	}

}
