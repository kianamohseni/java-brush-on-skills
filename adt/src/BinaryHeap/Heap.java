package BinaryHeap;

public class Heap {
	int[] Heap;
	int counter;
	
	public Heap() {
		Heap = new int[16];
		counter = 0;
	}
	private int parentIndex(int i) {
		return ((i-1)/2);
	}
	private int rightChildIndex(int i) {
		return (2*i+2);
	}
	private int leftChildIndex(int i) {
		return (2*i+1);
	}
	private boolean hasLeftChild(int i) {
		return((leftChildIndex(i) < counter) && (leftChildIndex(i) > 0));
	}
	private boolean hasRightChild(int i) {
		return((rightChildIndex(i) < counter) && (rightChildIndex(i) > 0));
	}
	private int getParent(int i) {
		return Heap[parentIndex(i)];
	}
	private int getLeftChild(int i) {
		return Heap[leftChildIndex(i)];
	}
	private int getRightChild(int i) {
		return Heap[rightChildIndex(i)];
	}
	private boolean hasParent(int i) {
		return (parentIndex(i) >= 0);
	}
	public void heapDown(int i) {
		int largerChild = 0;
		int leftChild = 0;
		int rightChild = 0;
		int largerChildIndex = 0;
		
		if (!hasLeftChild(i)){
			//no children. You are done.
			return;
			} else if (!hasRightChild(i)) {
				//only left child
				leftChild = getLeftChild(i);
			} else {
				//has both left and right child
				rightChild = getRightChild(i);
				if (leftChild > rightChild) {
					largerChildIndex = leftChildIndex(i);
					largerChild = leftChild;
				} else {
					largerChildIndex = rightChildIndex(i);
					largerChild = rightChild;
				}
			}
		swap(i, largerChildIndex);
		heapDown (largerChild);
		} 
	
	private void heapUp(int i) {
		if (hasParent(i)) {
			if (Heap[i] > getParent(i)) {
				swap (i, parentIndex(i));
				heapUp(parentIndex(i));
			}
		}
	}
	
	private void swap (int i, int j) {
		int interim = Heap[i];
		Heap[i] = Heap[j];
		Heap [j] = interim;
	}
		
	public int extractMax() {
		int result = Heap[0];
		heapDown(0);
		counter--;
		return result;
	}
	public void add(int i) {
		Heap[counter] = i;
		heapUp(counter);
		counter++;
	}
	public void printOut() {
		System.out.println("New Heap:");
		for (int i=0; i < counter; i++) {
			System.out.println(Heap[i]);
		}
	}
}
