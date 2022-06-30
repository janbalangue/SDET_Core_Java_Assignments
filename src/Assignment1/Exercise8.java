package Assignment1;

import java.util.Scanner;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		int num = -1;
		
		System.out.println("This program reverses the elements in a list of integers.");
		
		try (Scanner scanner = new Scanner(System.in)) {
			while (num < 1) {
				System.out.println("Enter the number of array elements:");
				num = scanner.nextInt();
				if (num < 1) {
					System.out.println("Elements must be 1 or more");
				}
			}
			int[] arr = new int[num];
			
			for (int i = 0; i < num; i++) {
				System.out.println("Enter element number " + (i + 1) + ":");
				arr[i] = scanner.nextInt();
			}
			
			System.out.print("Array in original order: ");
			printArr(arr);
			
			arr = reverse(arr);
			System.out.print("Array in reverse order: ");
			printArr(arr);
			
		} catch (Exception e) {
			System.out.println("Input error... exiting program");
		}
	}
	
	public static int[] reverse(int[] arr) {
		
		int len = arr.length;
		int[] reversed = new int[len];
		for (int i = 0, j = len - 1; i < len; i++, j--) {
			reversed[j] = arr[i];
		}
		return reversed;
	}
	
	public static void printArr(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
