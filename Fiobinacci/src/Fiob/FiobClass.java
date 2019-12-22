package Fiob;

public class FiobClass {
	private static int[] memo = new int[1000];
	private static int maxIndex = 0;
	
	public FiobClass() {
		
	}
	public static int naiveFindFiob(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		} else {		
			return (i + naiveFindFiob(i-1));
		}
	}
	public static  int smartFindFiob(int i) {
		if (i == 0) {
			memo[0] = 0;
			maxIndex = 0;
			System.out.println("index: " + i + " is " + memo[i]);
			return 0;
		} else if (i == 1) {
			memo[1] = 1;
			maxIndex = 1;
			System.out.println("index: " + i + " is " + memo[i]);
			return 1;
		} else if (memo[i] == 0){
			maxIndex = i;
			System.out.println("index: " + i + " is " + memo[i]);
			memo[i] = smartFindFiob(i-1) + smartFindFiob(i-2);
		}
		return (memo[i]);

	}
}
