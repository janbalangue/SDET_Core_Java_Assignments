package assignment4;

import java.util.HashMap;
import java.util.Map;


// check if a key exists in a map. also returns the key's value
public class A4E3 {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		int[] values = {4, 56, 0, 43, -2};
		
		map.put(12, 32);
		map.put(3, 43);
		map.put(-2, 0);
		map.put(0, -4);
		
		checkKeysInMap(map, values);
		
	}
	
	public static void checkKeysInMap(Map<Integer, Integer> map, int[] arr) {
		
		for (int i: arr) {
			if (map.containsKey(i)) {
				System.out.println("Map contains key " + i);
				System.out.println("Value for " + i + " is " + map.get(i));
			}
		}
	}

}
