package assignment3;

// re-throws an exception
public class A3E8 {
	
	public static void main(String[] args) {
		
		try {
			doNothing();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doNothing() throws Exception {
		
		try {
			System.out.println(Integer.parseInt("Hello world!"));
		} catch (NumberFormatException e) {
			throw new Exception("Exception re-thrown");
		}
	}

}
