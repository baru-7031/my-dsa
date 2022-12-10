package com.news;

public class Market {

	public static void main(String[] args) {
		
		int total = 130;
		
		System.out.println("Enter Market");
		if(total >= 100 ) {
			
			if(total >= 80) { 	// 20 Rs
				System.out.println("chicken price 80 buy");
				total -= 80;
			}
			if(total >= 50) {
				System.out.println("channa 50rs buy"); 
				total -= 50;
			}
			if(total >= 30) {
				System.out.println("Pen 30Rs Buy");
				total -= 30;
			}
			
		}
		else if(total <= 1000) {
			
		}
		else {
			
		}
		
		if(total >= 0) {
			System.out.println(total + " amount is save");
		}
		else {
			System.out.println(0);
		}

	}

}
