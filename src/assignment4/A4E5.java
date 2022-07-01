package assignment4;

import java.util.HashSet;
import java.util.Set;

// copy all elements of a HashSet into an Object array
public class A4E5 {
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("apple");
		set.add("banana");
		set.add("orange");
		set.add("blueberry");
		
		System.out.println("Set: " + set);
		
		Object[] arr = new Object[set.size()];
		
		int i = 0;
		for (String string: set) {
			arr[i++] = string;
		}
		
		System.out.print("Object array: ");
		
		for (Object object: arr) {
		System.out.print(object + " ");
	
		}
	}
}
