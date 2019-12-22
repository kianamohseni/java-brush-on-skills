package client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		Integer i = 100;
		String s = "Kiana";
		
		container<Integer, String> myContainer = new container<Integer, String>(i, s);
		System.out.println(myContainer.attr1 + " and " + myContainer.attr2);
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Set<Integer> set3 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set3 = union(set1,set2);
		System.out.println(set3);
		
		Set<String> set4 = new HashSet<String>();
		Set<String> set5 = new HashSet<String>();
		Set<String> set6 = new HashSet<String>();
		set4.add("1");
		set4.add("2");
		set4.add("3");
		set5.add("3");
		set5.add("4");
		set5.add("5");
		set6 = union(set4,set5);
		System.out.println(set6);
		
		Iterator<String> value = set6.iterator();
		while (value.hasNext()) {
			System.out.println(value.next());
		}
	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2); 
		return result;
	}
}
