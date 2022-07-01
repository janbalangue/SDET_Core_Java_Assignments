package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A4E7 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("apple");
		list.add("watermelon");
		list.add("lychee");
		list.add("pomegranate");
		list.add("banana");
		list.add("orange");
		list.add("blueberry");
		
		System.out.println("This program sorts a list alphabetically.");
		System.out.println("Unsorted list: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted list: " + list);
		
	}

}
