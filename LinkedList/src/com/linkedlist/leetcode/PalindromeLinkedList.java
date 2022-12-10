package com.linkedlist.leetcode;

import com.linkedlist.Node;

public class PalindromeLinkedList {

	public boolean isPalindrome(Node head) {

		Node faster = head;
		Node slower = head;

		while (faster != null && faster.next != null) {
			faster = faster.next.next;
			slower = slower.next;
		}

		Node revSlow = null;

		while (slower != null) {
			Node temp = slower.next;
			slower.next = revSlow;
			revSlow = slower;
			slower = temp;
		}

		Node check = head;

		while (revSlow != null) {
			if (revSlow.data != check.data)
				return false;
			System.out.println(revSlow.data + " " + check.data);
			revSlow = revSlow.next;
			check = check.next;
		}

		return true;
	}

}
