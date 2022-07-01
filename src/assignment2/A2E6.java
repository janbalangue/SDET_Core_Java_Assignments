package assignment2;

import java.util.ArrayList;
import java.util.List;

public class A2E6 {

	public static void main(String[] args) {
		
		int[] arr = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		List<Integer> checkedIntegers = new ArrayList<>();
		
		System.out.print("The following integers in the array are duplicates: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			if (checkedIntegers.contains(arr[i])) {
				System.out.print(arr[i] + " ");
			} else {
				checkedIntegers.add(arr[i]);
			}
		}
	}	
}
