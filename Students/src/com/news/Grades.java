package com.news;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		
//		Scanner Object
		Scanner sc = new Scanner(System.in);
		
//		Subjects 
		System.out.print("Enter subject a value : ");
		int a = sc.nextInt();
		System.out.print("Enter Subject b value : ");
		int b = sc.nextInt();
		System.out.print("Enter Subject c value : ");
		int c = sc.nextInt();
		
//		Calculation part
		int avg = (a+b+c) / 3;
		
		System.out.println(avg);
		
//		Find Grade
		if(avg <= 100 && avg >= 80) {		// 100 < avg >80
			System.out.println("A");
		}
		else if(avg < 80 && avg >= 60) {	// 80 < avg >60
			System.out.println("B");
		}
		else if(avg < 60 && avg >=40) {		// 60 < avg > 40
			System.out.println("C");
		}
		else if(avg < 40 && avg >= 0) {		// 40 < avg >0
			System.out.println("Fail");
		}
		else {
			System.out.println("Wrong Input");
		}
		
		
	}
}
