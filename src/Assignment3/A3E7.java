package Assignment3;

// nested try/catch blocks
public class A3E7 {

	public static void main(String[] args) {
		
		try {
			System.out.println("Java is fun!");
			
			try {
				
				System.out.println("This should throw an ArithmeticException: " + (5 / 0));
			
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			System.out.println("Exception thrown");
		}
	}
}
