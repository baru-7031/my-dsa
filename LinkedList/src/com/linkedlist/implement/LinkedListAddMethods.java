package com.linkedlist.implement;

import com.linkedlist.Node;

public class LinkedListAddMethods {
	
	public Node insert(int data, Node head, int pos) {
		
		Node Add = new Node(data);
		
		if(pos == 0) {
			Add.next = head;
			head = Add;
			return head;
		}
		
		Node prev = head;
		
		int i=0;
		while(i < pos-1 && prev != null) {
			
			prev = prev.next;
			
			i++;
		}
		Add.next = prev.next;
		prev.next = Add;
		
		return head;
	}
	
	public Node insertFirst(int data, Node head) {
		
		Node Add = new Node(data);
		
		Add.next = head;
		head = Add;
		
		return head;
	}
	
	public Node insertLast(int data, Node head) {
		
		Node Add = new Node(data);
		Node prev = head;
		
		while(prev.next != null) {
			prev = prev.next;
		}
		
		prev.next = Add;
		Add.next = null;
		
		return head;
	}
	
	public Node insertAuto(int data, Node head) {
		
		Node Add = new Node(data);
		
		Node prev = head;
		
		if(prev == null) {
			prev = Add;
			return prev;
		}
		
		while(prev.next != null) {
			prev = prev.next;
		}
		
		prev.next = Add;
		Add.next = null;
		return head;
	}
	
	
}










