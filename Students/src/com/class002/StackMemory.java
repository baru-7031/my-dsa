package com.class002;

public class StackMemory {

	public static void main(String[] args) {
		
		sums();
		System.out.println("Main Runnig...");
		
	}
	
	static int sums() {
		good();
		System.out.println("Sum Running...");
		return 0;
	}
	
	static int good() {
		System.out.println("Good Running...");
		return 0;
	}
	
}
