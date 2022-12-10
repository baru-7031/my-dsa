package com.linkedlist.implement;

import com.linkedlist.Node;

public class LinkedListOtherMethods {

	public int size(Node head) {
		
		int count = 0;
		
		Node cur = head;
		
		while(cur != null) {
			count++;
			cur = cur.next;
		}
		
		return count;
	}
	
	public int findIndex(int data, Node head) {
		
		Node cur = head;
		int index = 0;
		while(cur != null) {
			index++;
			
			if(cur.data == data) {
				return index;
			}
			cur = cur.next;
			
		}
		
		return -1;
	}
	
	public boolean isPresent(int data ,Node head) {
		
		Node cur = head;
		
		while(cur != null) {
			if(cur.data == data) return true;
			cur = cur.next;
		}
		
		
		return false;
	}
	
	public void print(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		
	}
}










