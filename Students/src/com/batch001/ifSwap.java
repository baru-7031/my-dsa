package com.batch001;

public class ifSwap {

	public static void main(String[] args) {
		
		int n1 = 40;
		int n2 = 30;
		
		if(n1 < n2) {
//			Swap
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println("n1 value is : " + n1);
		System.out.println("n2 value is : " + n2);
		
	}
}
