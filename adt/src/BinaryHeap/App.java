package BinaryHeap;

public class App {

	public static void main(String[] args) {
		int myMax = 0;
		Heap myHeap = new Heap();
		
		myHeap.add(50);
		myHeap.printOut();

		myHeap.add(40);
		myHeap.printOut();

		myHeap.add(90);		
		myHeap.printOut();
		
		myMax = myHeap.extractMax();
		System.out.println(myMax);
		myHeap.printOut();

	}

}
