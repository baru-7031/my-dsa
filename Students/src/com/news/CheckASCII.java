package com.news;

import java.util.Scanner;

public class CheckASCII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Character : ");
		char ch = sc.next().charAt(0);
		
//		int n1 = ch;
		
		System.out.println("Enter ASCII value : ");
		int n = sc.nextInt();
		
//		if(ch == n) {
//			System.out.println("Both are same");
//		}
//		else {
//			System.out.println("Not same");
//		}
		
		System.out.println((ch == n) ? "Both are same" : "Not same");

	}

}
