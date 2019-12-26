package Test;

import java.util.HashMap; // import the HashMap class

public class App {
	static String str = "Kiaan";
	static String str2 = "Kiaan";
	static int val = str.charAt(0);
	static int myVal = 0;

	public static void main(String[] args) {
        // Challenge: Given a string, see if you can detect whether it contains only
        // unique chars

		
		System.out.println(7);
		
		char[] myChar = new char[str.length()]; 
		myChar = str.toCharArray();
		System.out.println(myChar[0] + " " +myChar[1]);
		System.out.println("hasDup way:" + hasDup(myChar));
		
		System.out.println("hasMapWay: " + hashMapWay(str));
		System.out.println("isPermutation: " + isPermutation(str, str2));

	}
	public static boolean hasDup(char[] myChar){
		for (int i=0; i<=((myChar.length)-1); i++) {
			System.out.println(myChar[i] + " and " + myChar.length);
			for (int j=i+1; j<=(myChar.length-1); j++){
				System.out.println(myChar[j] + " -- " + j);
				if (myChar[i] == myChar[j]) {
					System.out.println(myChar[i] + " " + myChar[j]);
					return (true);
				}
			}
		}
	    return(false);
	}

	public static boolean hashMapWay (String myChar) {
		boolean result = false;
		HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		for (int i=0; i<=((myChar.length()-1)); i++) {
			System.out.println("myChar.charAt(i): " + myChar.charAt(i));
			Integer val = myMap.get(myChar.charAt(i));
			System.out.println("val: " + val);
			if (val != null) {
				return (true);
			} else {
				myMap.put(myChar.charAt(i), 1);
			}			
		}

		return(result);
	}
	public static boolean isPermutation(String str, String str2) {
		HashMap<Character, Integer> myMap1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> myMap2 = new HashMap<Character, Integer>();
		Integer val;
		System.out.println("str: " + str + " str1: " +  str2);
		
		for (int i=0; i<= (str.length()-1); i++){
			val = myMap1.get(str.charAt(i));
			System.out.println(val);
			if (val == null) {
				val = 1;
			} else {
				val++;
			}
			Integer value = val;
			myMap1.put(str.charAt(i), value);
		}
		System.out.println("myMap1: " + myMap1);
		
		for (int i=0; i<= (str2.length()-1); i++){
			val = myMap2.get(str2.charAt(i));
			System.out.println(val);
			if (val == null) {
				val = 1;
			} else {
				val++;
			}
			Integer value = val;
			myMap2.put(str2.charAt(i), value);
		}
		System.out.println("myMap2: " + myMap2);
		System.out.println(myMap1.keySet());
		System.out.println(myMap2.keySet());
		System.out.println(myMap1.values());
		System.out.println(myMap2.values());

		if (myMap1.equals(myMap2)) {
			return (true);
			}
		return (false);
	}
}