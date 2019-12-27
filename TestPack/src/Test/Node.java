package Test;

import java.util.Stack;

public class Node {
	int key;
	Node left, right;
	Stack<Node> myStack = new Stack<>();

	
	public Node(int key) {
		this.key = key;
	}
	
	public Node copy() {
		Node newNode = new Node(key);

		if (this.left != null) {
			newNode.left = this.left.copy();
		}
		if (this.right != null) {
			newNode.right = this.right.copy();
		}
		return newNode;
	}
	public void TopDownTraversal() {
		System.out.println(this.key);
		if (this.left != null) {
			this.left.TopDownTraversal();
		}
		if (this.right != null) {
			this.right.TopDownTraversal();
		}
	}
	public void inOrderTraversal() {
		
		if (this.left == null) {
//			System.out.println(this.left.key);
		} else {
			this.left.inOrderTraversal();
		}
		System.out.println(this.key);
		if (this.right == null) {
//			System.out.println(this.right.key);
		} else {
			this.right.inOrderTraversal();
		}
		
		
	}
}

