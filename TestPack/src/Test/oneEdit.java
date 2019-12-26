package Test;

public class oneEdit {

	public static void main(String[] args) {
		String str1 = "This is string 1.";
		String str2 = "This ns string 2.";
		
		int l1 = str1.length();
		int l2 = str2.length();
		System.out.println(isOneEdit(str1, str1, l1, l1));
		System.out.println(isOneEdit(str1, str2, l1, l2));
	}
	public static boolean isOneEdit(String str1, String str2, int l1, int l2) {
		char[] charArray1 = new char[l1];
		char[] charArray2 = new char[l2];
		int out = 0;
		int i,j = 0;
		
		charArray1 = str1.toCharArray();
		charArray2 = str2.toCharArray();
		
		if (l1 == l2) {
			for (i=0; i<= l1-1; i++) {
				System.out.println(charArray1[i] + " and " + charArray2[i]);
				if (charArray1[i] != charArray2[i]) {
					out++;
				}
				if (out > 1) {
					return (false);
				}
			}
		} else {
			if (l1==l2-1){
				for (i=0; i<=(l1-1); i++) {
					if (charArray1[i]!= charArray2[j]) {
						j++;
						if (charArray1[i]!= charArray2[j]) {
							return(false);
						}
					}
					j++;
				}
			}
			return (false);
		}
		return(true);
	}
}
