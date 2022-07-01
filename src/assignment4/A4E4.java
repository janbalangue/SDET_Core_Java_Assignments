package assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// extract map keys into a list
public class A4E4 {
	
	public static void main(String[] args) {
		
		Map<String, Boolean> map = new HashMap<>();
		
		map.put("smart", true);
		map.put("dedicated", true);
		map.put("perfect", false);
		
		System.out.println(map);
		
		List<String> keys = new ArrayList<>();
		
		for (String key: map.keySet()) {
			keys.add(key);
		}
		
		System.out.println(keys);
	}

}
