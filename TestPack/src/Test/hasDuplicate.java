package Test;

public class hasDuplicate {

		
	public static boolean hasDup(char[] myChar){
		for (int i=0; i<=myChar.length; i++) {
			for (int j=1; j<(myChar.length-i); j++){
				if (myChar[i] == myChar[j]) {
					return (true);
				}
			}
		}
	    return(false);
	}

}
