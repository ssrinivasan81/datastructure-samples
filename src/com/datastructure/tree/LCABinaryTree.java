package com.datastructure.tree;

class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 

class LCABinaryTree {

	Node root; 
	
	static Node lca(Node node, int n1, int n2) {
		if (node == null) 
			return null;
		
		if (node.data > n1 && node.data > n2) {
			return lca(node.left, n1, n2); 
		}
		if (node.data < n1 && node.data < n2) {
			return lca(node.right , n1,n2);
		}
		return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LCABinaryTree tree = new LCABinaryTree(); 
		
        tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22);
        
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        int none = 8;
        int ntwo = 14;
        Node n = lca(tree.root, none, ntwo);
        System.out.println("LCA of " + none + " and " + ntwo + " is " + n.data); 
	}

}
