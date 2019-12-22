package LinkedList;

public class Application {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		int value1 = 1;
		boolean success = false;

		
		myList.AddFront(value1);
		myList.AddFront(2);
		myList.AddFront(3);
		myList.AddFront(4);
		myList.AddFront(5);
		myList.AddFront(6);
		myList.AddFront(7);

		
		int value2 = myList.GetFront();
		System.out.println(value2);
		
		int size = myList.Size();
		System.out.println(size);
		System.out.println(myList.size);
		
//		myList.Clear();
//		size = myList.Size();
//		System.out.println(size);
//		System.out.println(myList.size);
		
		success = myList.Delete(5);
		System.out.println(myList.size);
		System.out.println(success);


	}

}
