package assignment3;


// throw a NumberFormatException and handle it
public class A3E5 {

	public static void main(String[] args) {
		
		String string = "Hello, world!";
		
		try {
			
			int num = Integer.parseInt(string);
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			
			System.out.println(string + " cannot be converted to an integer");
		}
	}
}
