package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {
		
		List<Integer> primes = new ArrayList<>();
		
		int numPrimes = 10;
		int count = 0;
		int num = 2;
		
		while (count < numPrimes) {
			if (isPrime(num)) {
				primes.add(num);
				count++;
			}
			num++;
		}
		System.out.println("First 10 prime numbers: " + primes);
	}
	
	public static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0 && num != i) {
				return false;
			}
		}
		return true;
	}
	
}