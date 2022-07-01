package assignment2;

public class A2E2 {
	
	public static void main(String[] args) {
		
		int num1 = 79;
		int num2 = 187;
		
		System.out.println("This program prints the odd numbers from " + num1 + " to " + num2);
		
		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
