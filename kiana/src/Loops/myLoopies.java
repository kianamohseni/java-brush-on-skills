package Loops;

public class myLoopies {

	public static void main(String[] args) {

		String str = "We have a large inventory of things in our warehouse falling in the category:apparel and the slightly more in demand category:makeup blah1 blah2 category:bedding here there everywhere category:cookery and more.                   ";
		printCategories(str);
	}
	public static void printCategories(String str) {
		
		int i = 0;
		int j = 0;
		String myString = str;
		
		i = myString.indexOf("category");

		while (i != -1) {
		myString = myString.substring(i+9);		
		j = myString.indexOf(" ");
		System.out.println(myString.substring(0,j));

		i = myString.indexOf("category");

		
		}
	}

}
