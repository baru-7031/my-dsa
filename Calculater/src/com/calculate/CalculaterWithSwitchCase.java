package com.calculate;

import java.util.Scanner;

public class CalculaterWithSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		while (true) {
			System.out.println("Enter which operation you want to execute : + , -, *, / ");
			System.out.println("Enter your Choice : ");

			char ch = sc.next().charAt(0);
			int a, b;
			
			switch (ch) {
			case '+':
				System.out.println("Enter your 1st number : ");
				a = sc.nextInt();
				System.out.println("Enter your 2nd number : ");
				b = sc.nextInt();
				System.out.println(a + b);
				break;
			case '*':
				System.out.println("Enter your 1st number : ");
				a = sc.nextInt();
				System.out.println("Enter your 2nd number : ");
				b = sc.nextInt();
				System.out.println(a * b);
				break;
			case '-':
				System.out.println("Enter your 1st number : ");
				a = sc.nextInt();
				System.out.println("Enter your 2nd number : ");
				b = sc.nextInt();
				System.out.println(a - b);
				break;
			case '/':
				System.out.println("Enter your 1st number : ");
				a = sc.nextInt();
				System.out.println("Enter your 2nd number : ");
				b = sc.nextInt();
				System.out.println(a / b);
				break;
			default:
				System.out.println("Invalid");

			}
			sc.nextLine();
			System.out.println("Do you want to continue if yes type YES/NO : ");
			String check = sc.nextLine();
			
			if(check.equals("YES")) {
				System.out.println("Thank You for using Visit again");
				break;
			}
			
			
		}

	}

}











