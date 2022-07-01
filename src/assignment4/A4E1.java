package assignment4;

import java.util.HashMap;
import java.util.Map;

// count duplicate letters
public class A4E1 {

	public static void main(String[] args) {
		
		String string = "aaaabbbccdddddeeffffggg";
		
		Map<Character, Integer> map = new HashMap<>();
		char letter;
		int temp;
		
		for (int i = 0; i < string.length(); i++) {
			
			letter = string.charAt(i);
			
			if (map.containsKey(letter)) {
				temp = map.get(letter);
				map.replace(letter, temp, temp + 1);
			} else {
				map.put(letter, 1);
			}
		}
		System.out.println(map);
	}
}
