package Assignment3;

public class A3E3 {

	public static void main(String[] args) {
		
		String sentence = "A brown fox ran away fast";
		String word = "brown";
		boolean found = false;
		
		outer:
		for (int i = 0; i < sentence.length(); i++) {
		
			if (sentence.charAt(i) == word.charAt(0)) {
			
				for (int j = 1; j < word.length(); j++) {
					if (sentence.charAt(i + j) != word.charAt(j)) {
						break;
					} else if (j == word.length() - 1) {
						found = true;
						break outer;
					}
				}
			}
		}
		if (found) {
			System.out.println("The word " + word + " was found in sentence: " + sentence);
		} else {
			System.out.println("The word " + word + " was not found in sentence: " + sentence);
		}
		
	}
}
