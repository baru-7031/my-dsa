package com.linkedlist.main;

import java.util.Scanner;

import com.linkedlist.Node;
import com.linkedlist.implement.LinkedListAddMethods;

public class FirstMainAddMethods {

	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		
		Node head = n1;
		
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		
		Node cur = head;
		
		while(cur != null) {
			System.out.print(cur.data + " ");
			
			cur = cur.next;
			
		}
		
		System.out.println("\nAdd Value ");
		
		LinkedListAddMethods add = new LinkedListAddMethods();

//		Add Any Where
		cur = add.insert(90, head, 0);
		
		while(cur != null) {
			System.out.print(cur.data + " ");
			
			cur = cur.next;
		}
		
//		Add Only First Position
		System.out.println("\n\n=======Add Value in First=========");
		
		cur = add.insertFirst(40, head);
		cur = add.insertFirst(60, cur);
		cur = add.insertFirst(110, cur);
		
		Node store = cur;
		
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		
//		Add Only LAst Position
		System.out.println("\n\n=======Add Value in Last=======");
		cur = add.insertLast(120, store);
		
		while(cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		
//		Auto Add 
		
//		Node nodeNew = new Node(20);
//		Node news=null;
//		nodeNew = add.insertAuto(30, news);
//		nodeNew = add.insertAuto(40, nodeNew);
//		System.out.println("\n\n===========Add Auto Values=============");
//		while(nodeNew != null) {
//			System.out.print(nodeNew.data + " ");
//			nodeNew = nodeNew.next;
//		}
		System.out.println("\n\n========== Add value In LinkedList Using Scanner Class =============\n\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Range : ");
		int range = sc.nextInt();
		Node autoNode = null;
		for(int i =0; i<range; i++) {
			
			System.out.println("Enter Your Value : " );
			int datas = sc.nextInt();
			
			
			autoNode = add.insertAuto(datas, autoNode);
			
		}
		
		Node storeNode = autoNode;
		
		while(storeNode != null) {
			
			System.out.print(storeNode.data + " ");
			storeNode = storeNode.next;
			
		}
		
		
	}

}












