package com.datastructure.linkedlist;

class Node {
	int item;
	Node next;
	Node (int data) {
		this.item = data;
		next = null;
	}
}
public class ReverseSingleLinkedList {
	
	static Node head;
	
	static Node reverselist(Node node) {
		Node current = node;
		Node prev = null;
		Node next = null;
		
		while (current != null) {
			next = current.next;			
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
		
	}
	static void printNode (Node node) {
		while (node != null) {
			System.out.println(node.item);
			node = node.next;
		}
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		ReverseSingleLinkedList list = new ReverseSingleLinkedList();

		list.head = new Node(20);
		list.head.next = new Node(100);
		list.head.next.next = new Node(200);
		list.head.next.next.next = new Node(300);

		printNode( head);
		Node nn = reverselist(head);
		
		printNode( nn);
	}

}
