package Assignment2;

public class A2E1 {

	public static void main(String[] args) {
		
		int[] values = { 1, 2, 3, 4, 5};
		int sum = 0;
		int average;
		
		System.out.println("This program displays the average of values in an integer array.");
		
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		average = sum / values.length;
		
		System.out.println("Average: " + average);
	}
	
}
