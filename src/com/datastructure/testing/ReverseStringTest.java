package com.datastructure.testing;

class Node {
	int data;
	Node left, right;
	
	Node (int item) {
		this.data = item;
		this.left = null;
		this.right = null;
	}
}
public class ReverseStringTest {

	static Node root;
	static Node lca (Node node, int n1, int n2) {
		
		if (node == null) {
			return null;
		}
		
		if (node.data > n1 && node.data > n2) {
			lca(node.left , n1, n2);
		} else if (node.data < n1 && node.data < n2) {
			lca (node.right , n1, n2);
		}
		
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseStringTest tree = new ReverseStringTest();
		tree.root  = new Node(20);
		
		tree.root.left = new Node(12);
		tree.root.right = new Node(25);
		
		tree.root.left.left = new Node(10);
		tree.root.left.right = new Node(15);
		
		tree.root.right.left = new Node(21);
		tree.root.right.right = new Node(26);
		
		Node nd = lca(root, 12,21);
		System.out.println(nd.data);
		
	}

}
