package Loops;

public class forLoop {

	public static void main(String[] args) {
		String name = "Kiana Mohseni";
		int lastIndex = name.length() - 1;
		int firstIndex = 0;
		for (int i = lastIndex; i>=firstIndex; i--) {
			System.out.print(name.charAt(i));
		}
		
		int start = 0;
		int end = 10;
		for (int n = start; n <= end; n++) {
//			System.out.println("testing: " + n + "modulus is: " + n%2);
			if (n%2 != 0) {
				System.out.println("this number is an add number: " + n);
			}
		}
	}

}
