package Test;

public class newApp {

	public static void main(String[] args) {
		String str1 = "abbcccddd";
		int length = str1.length();
		
		char[] charSet = compress(str1, length);
		for (int i=0; i<=(charSet.length-1); i++) {
			System.out.print(charSet[i]);
		}
	}
	public static char[] compress (String str, int length) {
		char[] charArray = new char[length];
		charArray = str.toCharArray();
		int repeat = 0;
		char[] newString = new char[length];

		
		for (int i=0; i<=(str.length()-1); i++) {
			char c = charArray[i];
			System.out.println(c);
			for (int j=i+1; ((j<=(str.length()-1-i)) && !; j++) {
				System.out.println("charArray[j]: " + charArray[j]);

				if (c == charArray[j]) {
					repeat++;
					System.out.println(repeat);
				}
				else {
					break = true;
				};
			}
			newString[i] = c;
			if ((repeat > 0) && ((i<length-1))){
				newString[i+1]= (char)(repeat);
			}
		}
		return(newString);
	}
}
