package assignment3;

import java.util.HashMap;
import java.util.Map;

// Count occurrences of letters in a string, converting it to lower case first.

public class A3E1 {
	
	public static void main(String[] args) {
		
		String name = "DevLabs Alliance Training";
		System.out.println("This program prints the occurrences of each letter in " + name);
		
		Map<Character, Integer> letterCount = new HashMap<>();
		
		char letter;
		
		String lcName = name.toLowerCase();
		
		int value;
		
		for (int i = 0; i < name.length(); i++) {
			letter = lcName.charAt(i);
			if (letter == ' ') continue;
			
			if (letterCount.containsKey(letter)) {
				value = letterCount.get(letter);
				letterCount.replace(letter, value, value + 1);
			} else {
				letterCount.put(letter, 1);
			}
		}
		System.out.println(letterCount.entrySet());
	}

}
