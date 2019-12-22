package BinaryTrees;

public class Application {

	public static void main(String[] args) {
		Node node = new Node(5, "5");
		node.printNode(node);
		Node newNode = new Node(3, "3");
		node.add(node, newNode);
//		node.printNode(node);
		
		newNode = new Node(4, "4");
		node.add(node, newNode);
//		node.printNode(node);
		
		newNode = new Node(7, "7");
		node.add(node, newNode);
//		node.printNode(node);
		
		newNode = new Node(9, "9");
		node.add(node, newNode);
//		node.printNode(node);
		
		newNode = new Node(8, "8");
		System.out.println("tree value");
		node.add(node, newNode);
		node.printNode(node);
		
		System.out.println("tree value");
		node.delete (node, 7);
		node.printNode(node);

		}

}
