package Assignment3;

public class A3E4 {
	
	public static void main(String[] args) {
		
		String originalString = "Shikamaru is a brilliant tactician.";
		
		System.out.println("Converting string to char array...");
		char[] arr = stringToCharArray(originalString);
		
		System.out.println(arr);
		
		System.out.println("\nConverting char array to string...");
		
		String newString = charArrayToString(arr);
		System.out.println(newString);
		
		
	}
	
	public static char[] stringToCharArray(String string) {
		
		char[] arr = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			arr[i] = string.charAt(i);
		}
		return arr;
	}
	
	public static String charArrayToString(char[] arr) {
		
		StringBuilder builder = new StringBuilder();
		for (char c: arr) {
			builder.append(c);
		}
		return builder.toString();
	}
}
