package assignment1;

public class A1E1 {

	public static void factorial(int n) {
		if (n > 1) {
			int fact = 1;
			for (int i = 2; i <= n; i++) {
				fact *= i;
			}
			System.out.println(fact);
		} else if (n >= 0) {
			System.out.println(1);	
		} else {
			System.out.println("Invalid input");
		}
	}
	
	public static void main(String[] args) {
		factorial(4);
		factorial(3);
		factorial(-1);
	}

}
