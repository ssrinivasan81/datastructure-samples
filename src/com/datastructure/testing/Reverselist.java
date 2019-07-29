package com.datastructure.testing;

class Node1 {
	int data;
	Node1 next;
	
	Node1 (int item) {
		this.data = item;
		this.next = null;
	}
}
public class Reverselist {

	Node1 root;
	
	static Node1 reverse(Node1 node) {
		Node1 current = node;
		Node1 prev = null;
		Node1 next = null;
		
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	static void printint(Node1 node) {
		while (node != null) {
			System.out.println("Data:"+ node.data);
			node = node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverselist list = new Reverselist();
		
		list.root = new Node1(50);
		list.root.next = new Node1(34);
		list.root.next.next = new Node1(22);		
		
		Node1 rev = reverse(list.root);
		printint(rev);
		
	}

}
