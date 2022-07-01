package assignment4;

import java.util.ArrayList;
import java.util.List;

// reverse an ArrayList and all the elements within it
public class A4E2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("DevLabs");
		list.add("Alliance");
		list.add("Training");
		list.add("rocks!");
		
		System.out.println(list);
		
		list = reverseList(list);
		
		System.out.println(list);
	}
	
	public static List<String> reverseList(List<String> list) {
		
		int count = list.size() - 1;
		List<String> reversedList = new ArrayList<>();
	
		for (int i = count; i >= 0; i--) {
			
			reversedList.add(reverseString(list.get(count--)));
		}
		
		return reversedList;
	}
	
	public static String reverseString(String string) {
	
		StringBuilder builder = new StringBuilder();
		
		for (int i = string.length() - 1; i >= 0; i--) {
			builder.append(string.charAt(i));
		}
		
		return builder.toString();
	}
}
