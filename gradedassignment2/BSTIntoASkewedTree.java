package com.gl.dsa.gradedassignment2;

public class BSTIntoASkewedTree {
	static class Node {
		int key;
		Node left, right;
	}
	// Function to create a new BST node
	static Node newNode(int data){
		Node temp = new Node();
		temp.key = data;
		temp.left = temp.right = null;
		return temp;
	}

	// Function to insert a new node with
	// given key in BST
	static Node insert(Node root, int key){

		Node newnode=newNode(key); 
		Node x=root;
		Node current_parrent=null;

		while (x!=null) {
			current_parrent=x;
			if (key<x.key)
				x=x.left;
			else if (key>x.key)
				x=x.right;
			else {
				System.out.println("Value already Exists!!!");
				return newnode;
			}

		}

		// 
		if (current_parrent == null)
			current_parrent=newnode;


		//assign the new node to the left child 
		else if (key<current_parrent.key) {
			current_parrent.left=newnode;}
		//assign the new node to the right child 
		else {
			current_parrent.right=newnode;
			//return pointer to new node

		}
		return current_parrent;

	}

	
	// function to skewed tree
	static void skewed(Node root) {
		if (root!=null) {
			skewed(root.left);
			System.out.println(root.key+ " ");
			skewed(root.right);
		}
	}
	
	
	// Driver Code
	public static void main(String[] args)
	{

		/* Let us create following BST
                50
             /     \
            30      60
           /       /  
         10       55   
		 */
	Node root = null;
		
	// inserting value 50
		root = insert(root, 50);

		// inserting value 30
		insert(root, 30);

		// inserting value 10
		insert(root, 10);

		// inserting value 60
		insert(root, 60);

		// inserting value 55
		insert(root, 55);  
	
	skewed(root);
	}
}
