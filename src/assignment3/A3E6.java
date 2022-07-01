package assignment3;

// write a method that throws ArithmeticException
public class A3E6 {
	
	public static void main(String[] args) {
		
		int[] nums = { 23, 42, 4, 12 };
		int[] divisors = { 23, 6, 0, 3 };
		
		for (int i = 0; i < nums.length; i++) {
			try {
				System.out.println(nums[i] + " divided by " + divisors[i] + " is " + divide(nums[i], divisors[i]));
			} catch (ArithmeticException e) {
				System.out.println("Call to divide failed with " + nums[i] + " and " + divisors[i]);
			}
		}
	}
	
	public static int divide(int num, int divisor) throws ArithmeticException {
		return num / divisor;
	}
}
