package LinkedList;

public class LinkedList {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int value) {
			this.data = value;
		}
	}

	Node head;
	Node tail;
	int size;

	public LinkedList() {

	}
		
	public void AddFront(int value) {
		Node newNode = new Node(value);
		size++;
		
		if (head == null) {
			head = newNode;
			return;
		} else {
			newNode.next = head;
			head = newNode;
			return;
		}
	}
	
	public int GetFront() {
		return head.data;
	}
	public int Size() {
		Node currentNode = head;
		int size = 0;

		while (currentNode != null) {
			currentNode = currentNode.next;
			size++;
		}
		return size;
	}
	public void Clear() {
		head = null;
		tail = null;
		size =0;
	}
	
	public boolean Delete(int value) {
		int position = 0;
		if (head == null) {
			return false;
		}
		if ( head.data == value) {
			head = head.next;
			return true;
		}
		Node currentNode = head;
		while (currentNode.next.data != value) {
			currentNode = currentNode.next;
			position++;
			if (currentNode.next == null) {
				return false;
			}
		}
		currentNode.next = currentNode.next.next;
		size--;
		System.out.println(position);
		return true;
	}
}
