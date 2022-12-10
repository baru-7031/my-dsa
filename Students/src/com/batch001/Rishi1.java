package com.batch001;

import java.util.Scanner;

public class Rishi1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any number");
		int n = sc.nextInt();
		
		int result = 0;
		int temp = n;
		
		while(n > 0) {
			
			int res = n%10;
			result = result + (res * res * res);
			n = n/10;
			
		}
		
		if(temp == result)
			System.out.println(true);
		else 
			System.out.println(false);
		
		
	}
	
}
