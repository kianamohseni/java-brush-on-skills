package Test;

public class FBApp {

	public static void main(String[] args) {
		Node myNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node fourthNode = new Node(4);
		Node fifthNode = new Node (5);
		Node sixthNode = new Node(6);
		Node seventhNode = new Node (7);
		
		myNode.left = secondNode;
		myNode.right = thirdNode;
		secondNode.left = fourthNode;
		secondNode.right = fifthNode;
		thirdNode.left = sixthNode;
		thirdNode.right = seventhNode;
		
		Node newNode = myNode.copy();
	
		
//		newNode.TopDownTraversal();
		myNode.inOrderTraversal();
		
		
	}

}
