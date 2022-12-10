package com.shreya;

import java.util.HashMap;

public class StringWithShreya {

	public static void main(String[] args) {
		
		int[] arr = {2,4,2,9,4,2,1};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		
		for(int i=0; i<arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		
		hm.forEach((key,value) -> {
			System.out.println(key + " -> " + value);
		});
		
		
		
		
//		int[] arr = {2,4,2,9,4,2,1};
//		int[] store = new int[arr.length];
//		int index = 0;
//		for(int i =0; i<arr.length; i++) {
//			
//			int count=1;
//			boolean found = false;
//			for(int j =i+1; j<arr.length; j++) {
//				
//				if(arr[i] == arr[j]) {
//					
//					for(int k =0; k<store.length; k++ ) {
//						if(arr[i] == store[k]) {
//							found = true;
//						}
//						
//					}
//					
//					if(found == false) {
//						count++;
//					}
//				}
//				
//			}
//			boolean checkIsPresent = false;
//			for(int k =0; k<store.length; k++) {
//				if(store[k] == arr[i]) {
//					checkIsPresent = true;
//				}
//			}
//			
//			if(checkIsPresent == false) {
//				store[index] = arr[i];
//			}
//			
//			
//			System.out.println(arr[i] + " dublicate is " + count);
//		}
	}

}
