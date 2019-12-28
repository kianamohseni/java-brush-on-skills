package DynamicArrays;

public class App {

	public static void main(String[] args) {
		
		ArrayClass myArray = new ArrayClass(10);
		
		myArray.set(0, 10);
		myArray.set(1, 1);
		myArray.set(2, 2);
		myArray.set(3, 3);
		myArray.set(4, 4);
		myArray.set(5, 5);
		myArray.set(6, 6);
		myArray.set(7, 7);
		myArray.set(8, 8);
		myArray.set(9, 9);
		System.out.println("Array contains a 12: " + myArray.contains(12));

		myArray.insert(3, 12);
		System.out.println("Array contains a 12: " + myArray.contains(12));

		myArray.printMe();
		myArray.delete(3);
		System.out.println("Deleted");
		myArray.printMe();
		System.out.println("Array is empty: " + myArray.isEmpty());
		System.out.println("Array contains a 12: " + myArray.contains(12));
	}

}
