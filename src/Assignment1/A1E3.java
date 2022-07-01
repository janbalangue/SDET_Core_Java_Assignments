package assignment1;

import static java.util.Arrays.sort;

public class A1E3 {
	
	private static int[] arr = {3, 2, 8, 4, 6};

	public static void main(String[] args) {		
		sort(arr);
		printArr(arr);

	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
