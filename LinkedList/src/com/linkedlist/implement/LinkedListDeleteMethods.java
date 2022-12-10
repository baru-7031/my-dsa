package com.linkedlist.implement;

import com.linkedlist.Node;

public class LinkedListDeleteMethods {

	public void deleteOne(int data, Node head) {
		
		Node prev = head;
		
		while(prev.next != null) {
			
			if(prev.next.data == data) {
				
				prev.next = prev.next.next;
				return;
			}
			prev = prev.next;
		}
		
		throw new NullPointerException();
	}
	
	public Node deleteAll(Node head) {
		head = null;
		return head;
	}
	
}
