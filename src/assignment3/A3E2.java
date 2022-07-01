package assignment3;

public class A3E2 {
	
	public static void main(String[] args) {
		
		String string = "trurt";
		char letter1, letter2;
		
		System.out.println("This program determines whether " + string + " is a palindrome.");
		
		for (int i = 0; i < string.length()/2; i++) {
			letter1 = string.charAt(i);
			letter2 = string.charAt(string.length() - i - 1); // subtract 1 because string.length() is not a valid index
			
			if (letter1 != letter2) {
				System.out.println(string + " is not a palindrome.");
				return;
			}
		}
		System.out.println(string + " is a palindrome.");
	}
}
