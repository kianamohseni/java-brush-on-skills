package cars;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(12);
		myList.add(30);
		myList.add(90);
		printMe(myList);
		
		ArrayList<Integer> secondList = new ArrayList<Integer>();
		secondList.add(77);
		secondList.add(66);
		
		myList.addAll(secondList);
		printMe(myList);
		
		System.out.println(myList.contains(90));

		ArrayList<Integer> soldList = new ArrayList<Integer>();
		soldList.add(90);
		myList.removeAll(soldList);
		printMe(myList);
	
		System.out.println(myList.contains(90));

//		myList.clear();
//		printMe(myList);
		
		myList.retainAll(secondList);
		printMe(myList);
		
		HashSet<Integer> hashie = new HashSet<Integer>(myList);
		printMe(hashie);

		
	}
	static void printMe(List<Integer> list) {
		System.out.print("[");
		int i = 0;
		for (Integer value : list) {
			System.out.print(value);
			i++;
			if (i < list.size()) {
				System.out.print(", ");

			}
		}
		System.out.println("]");

	}
	static void printMe(AbstractSet<Integer> list) {
		System.out.print("[");
		int i = 0;
		for (Integer value : list) {
			System.out.print(value);
			i++;
			if (i < list.size()) {
				System.out.print(", ");

			}
		}
		System.out.println("]");

	}
}
