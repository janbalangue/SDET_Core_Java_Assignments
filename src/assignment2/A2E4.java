package assignment2;

public class A2E4 {
	
	public static void main(String[] args) {
		
		int n = 1234;
		
		System.out.println("This program displays the sum of the individual digits of " + n + ".\n");
		
		int sum = 0;
		int digit;
		while (n > 0) {
			digit = n % 10;
			System.out.println("Digit: " + digit);
			sum += digit;
			n /= 10;
			System.out.println("n: " + n);
		}
		
		System.out.println("\nSum: " + sum);
		
	}
}
