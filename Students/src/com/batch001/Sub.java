package com.batch001;

import java.util.Arrays;

public class Sub extends Base{
	
	void printSub(int[] a) {
		System.out.println("the Sub class print method");
	}
	
	public static void main(String[] args) {
		Sub object = new Sub();
		
		int[] arr = {12,3,4};
		
		object.printSub(arr);
		
		object.printBase();
	}
}

class Base {
	void printBase() {
		System.out.println("The base class print method");
	}
}