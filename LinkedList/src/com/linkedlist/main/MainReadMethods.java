package com.linkedlist.main;

import com.linkedlist.Node;
import com.linkedlist.implement.LinkedListAddMethods;
import com.linkedlist.implement.LinkedListDeleteMethods;
import com.linkedlist.implement.LinkedListOtherMethods;
import com.linkedlist.implement.LinkedListUpdateMethods;

public class MainReadMethods {

	public static void main(String[] args) {
		
		Node node1 = new Node(10);
		
		LinkedListAddMethods add = new LinkedListAddMethods();
		LinkedListOtherMethods others = new LinkedListOtherMethods();
		LinkedListDeleteMethods delete = new LinkedListDeleteMethods();
		LinkedListUpdateMethods update = new LinkedListUpdateMethods();
		
		add.insertAuto(20, node1);
		add.insertAuto(30, node1);
		add.insertAuto(40, node1);
		
		others.print(node1);
		
		System.out.println("\n\n========= Find Value Preset Of Not =============");
		
		int index =  others.findIndex(5, node1);
		
		System.out.println(index);
		
		
//		delete.deleteOne(20, node1);
//		
//		others.print(node1);
//		
//		System.out.println();
//		delete.deleteOne(30, node1);
//		
//		others.print(node1);
		
		System.out.println("======Update Value=====");
		update.updateOne(1, 1000, node1);
		others.print(node1);
		System.out.println();
		update.updateOne(3, 5000, node1);
		others.print(node1);
		
		
		
//		System.out.println("\n=======Delete All========");
//		node1 = delete.deleteAll(node1);
//		others.print(node1);
		
	}
}













