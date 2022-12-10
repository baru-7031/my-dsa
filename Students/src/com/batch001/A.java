package com.batch001;

public class A extends B {
	
	public static void main(String[] args) {
		
		sum(10, 20);
		
	}
	
}

class B {
	int a;
	int b;
	
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
}



