package gfg.intro;

import java.util.Scanner;

public class FirstSumOfNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Any number and check Sum of Natural numbers : ");
		int n = sc.nextInt();
		
		int res = n*(n+1)/2;
		System.out.println(res + " Sum of Natural numbers ");
		
	}

}
