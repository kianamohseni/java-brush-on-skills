package DynamicArrays;

public class ArrayClass {

	private int[] myArray;
	private int mySize;
	private int myCapacity;
	
	public ArrayClass(int capacity) {
		
		myArray = new int[capacity];
		mySize = 0;
		myCapacity = capacity;

	}
	
	public void set(int index, int value) {
		myArray[index] = value;
		mySize++;
		System.out.println(myArray[index]);
	}
	public int get(int index) {
		return myArray[index];
	}
	public void insert (int index, int value) {
		
		if (mySize == myCapacity) {
			//double the size
			resize();
			myArray[index]=value;
			//System.out.println("mySize is same as myCapacity");
		} else {
			for (int j=mySize; j>index; j--) {
				myArray[j] = myArray[j-1];
			}
			myArray[index]=value;
			mySize++;
		}
	}
	public void delete(int index) {
		for (int i=index; i<mySize; i++) {
			myArray[i]=myArray[i+1];
		}
		myArray[mySize]=0;
		mySize--;
		
	}
	public boolean isEmpty() {
		boolean result = false;
		if (mySize == 0) {
			result=true;
		}
		return result;
	}
	public boolean contains (int value) {
		for (int i=0; i<mySize; i++) {
			if (myArray[i]==value) {
				return(true);
			}
		}
		return(false);
	}
	public void printMe() {
		for (int i=0; i<=(myCapacity-1); i++) {
			System.out.println("index " + i + " is: " + myArray[i]);
		}
	}
	public void resize() {
		int[] newArray = new int[myCapacity*2];
		
		for (int i=0; i<myCapacity; i++) {
			newArray[i] = myArray[i];
		}
		myArray=newArray;
		myCapacity = 2 * myCapacity;
	}
}
