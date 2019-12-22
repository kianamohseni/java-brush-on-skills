package TestApp;

public class TestApp {

	public static void main(String[] args) {
		HashTable myTable = new HasTable();
		
		myTable.put("first", 1);
		myTable.put("second", 2);
		myTable.put("third", 3);
		
		System.out.println("first, " + myTable.get("first)"));
		System.out.println("second, " + myTable.get("second)"));
		System.out.println("third, " + myTable.get("third)"));

	}

}
