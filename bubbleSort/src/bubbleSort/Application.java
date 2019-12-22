package bubbleSort;

public class Application {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		arr[0] = 100;
		arr[1] = 80;
		arr[2] = 90;
		arr[3] = 60;
		arr[4] = 70;
	
	for (int i=0; i<5; i++) {
		System.out.println(arr[i]);
	}
	
	bubbleSort.sort(arr);
	
	for (int i=0; i<5; i++) {
		System.out.println(arr[i]);
	}

}
}
