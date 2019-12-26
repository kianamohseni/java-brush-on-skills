package Test;

import java.util.HashMap; // import the HashMap class

public class App {

	public static void main(String[] args) {
        // Challenge: Given a string, see if you can detect whether it contains only
        // unique chars
		String str = "Kiaan";
		int val = str.charAt(0);
		
		System.out.println(7);
		
		char[] myChar = new char[str.length()]; 
		myChar = str.toCharArray();
		System.out.println(myChar[0] + " " +myChar[1]);
		System.out.println("hasDup way:" + hasDup(myChar));
		
		System.out.println("hasMapWay: " + hashMapWay(str));

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
		int value = 0;
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
}