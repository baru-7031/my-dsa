package com.linkedlist.implement;

import com.linkedlist.Node;

public class LinkedListUpdateMethods {

	public Node updateOne(int index, int data, Node head) {
		
		Node cur = head;
		int count = 0;
		while(cur != null) {
			if(count == index) {
				cur.data = data;
			}
			cur = cur.next;
			count++;
		}
		
		return head;
	}
}
