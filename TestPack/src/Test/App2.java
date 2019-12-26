package Test;

public class App2 {

	public static void main(String[] args) {
		String myString = "Kiana Mohseni";
		
		char[] result =  URLify(myString, myString.length());
		for (int i=0; i<=(result.length-1); i++) {
			System.out.print(result[i]);
		}
	}
	public static char[] URLify(String str, int length) {
		char[] myCharSet = new char[length];
		char[] result = new char[length*3];
		int i, j = 0;
		
		myCharSet = str.toCharArray();
		
		for (i=0; i<=(length-1); i++) {
			if (myCharSet[i] == ' ') {
				result[i]='%';
				result[i+1]='2';
				result[i+2]='0';
				j=j+3;
			} else {
				result[j] = myCharSet[i];
				j++;
			}
		}
		return (result);
	}
}
