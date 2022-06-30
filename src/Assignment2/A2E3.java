package Assignment2;

public class A2E3 {
	
	public static void main(String[] args) {
		
		int num = 13;
		
		System.out.println("This program determines if " + num + " is prime.");
		System.out.println("It does this by iterating divisors from 2 to the square root of " + num + " and checking for a remainder.");
		System.out.println("If a quotient without a remainder is not found by this point, " + num + " is prime.\n");
		
		if (isPrime(num)) {
			System.out.println(num + " is prime.");
		} else {
			System.out.println(num + " is not prime.");
		}
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0 && num != i) {
				System.out.println("Divisor is " + i);
				return false;
			}
		}
		return true;
	}

}
