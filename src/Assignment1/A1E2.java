package Assignment1;

public class A1E2 {

	
	public static void main(String[] args) {
		printFib(10);
		printFibWithoutRecursion(10);
	}
	

	public static int calcFib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return calcFib(n - 1) + calcFib(n - 2);
	}
	

	public static void printFib(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(calcFib(i));
			if (i < n - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	public static void printFibWithoutRecursion(int n) {
		int first = 0;
		int second = 1;
		int sum;
		for (int i = 0; i < n; i++) {
			System.out.print(first);
			if (i < n-1) {
				System.out.print(", ");
			}
			sum = first + second;
			first = second;
			second = sum;
		}
		System.out.println();
	}

}
