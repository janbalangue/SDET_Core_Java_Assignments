package Assignment2;

public class A2E5 {
	
	public static void main(String[] args) {
		
		int num = 123;
		
		System.out.println("This program reverses the number " + num + ".");
		
		String numString = String.valueOf(num);
		System.out.println("Reverse: " + reverse(numString));
	}
	
	public static String reverse(String str) {
		StringBuilder reverseStr = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr.append(str.charAt(i));
		}
		return reverseStr.toString();
	}

}
