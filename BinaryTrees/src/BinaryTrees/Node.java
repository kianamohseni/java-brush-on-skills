package BinaryTrees;

	
public class Node {
	int key;
	String value;
	Node left, right;
	
	Node (int key, String value){
		this.key = key;
		this.value = value;
		this.left = null;
		this.right = null;
	
	}
		
	public Node min (Node root) {
		if (root == null){
			return null;
		} else if (root.left == null){
			return root;
		} else {
			return (min(root.left));
		}
	}

	
	public Node add(Node root, Node node) {
		if (root == null) {
			root = node;
		} else if (root.key < node.key) {
			System.out.println("checking right: " + root.right);
			root.right = add(root.right, node);
		} else if (root.key > node.key) {
			System.out.println("checking left: " + root.left);
			root.left = add(root.left, node);
		}
		return root;
	}
	
	public void printNode(Node root) {
		if (root != null) {
			System.out.println("key: " + root.key + ", value: " + root.value);
			if (root.right != null) {
				System.out.println("right");
				printNode (root.right);
			}
			if (root.left != null) {
				System.out.println("left");
				printNode (root.left);
			}
		}
	}
	
	public void delete (Node node, int key) {
		if (node == null) {
			return;
		} else if (node.key < key) {
			System.out.println("deleting to the right");
			delete (node.right, key);
		} else if (node.key > key) {
			System.out.println("deleting to the left");
			delete (node.left, key);
		} else {
			System.out.println("Gotcha!");
			// we found it. do the operation
			if (node.right == null && node.left == null) {
				//no children
				node = null;
				
			} else if (node.right == null || node.left == null) {
				//one child
				if (node.right == null) {
					node = node.left;
				} else if (node.left == null) {
					node = node.right;
				}
			} else {
				//two children
				// find smallest key on the right
				Node minRight = node.min(node.right);
				
				//duplicate values to current node
				node.key = minRight.key;
				node.value = minRight.value;
				
				//delete the node you just duplicated
				
			}
		}
	}
}