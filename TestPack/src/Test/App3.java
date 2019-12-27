package Test;

import java.util.ArrayList;

public class App3 {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {2,4,6};
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		result = intersect(arr1, arr2);
		System.out.println(result);
		
	}
	
	public static ArrayList<Integer> intersect(int[] arr1, int[] arr2) {
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		
		for (int i=0; i<=((arr1.length)-1); i++) {
			for (int j=0; j<=((arr2.length)-1); j++) {
				if (arr1[i] == arr2[j]){
					myArrayList.add(arr1[i]);				
				}
		}
	}
		return myArrayList;

}
}
