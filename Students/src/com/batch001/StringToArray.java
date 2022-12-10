package com.batch001;

import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name : ");
		String str = sc.nextLine();
		
		char[] characters = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			characters[i] = str.charAt(i);
		}
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(characters[i]);
		}
		
	}
}
