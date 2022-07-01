package assignment4;

import java.util.TreeSet;

// get first and last elements of a TreeSet
public class A4E6 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(2);
		set.add(17);
		set.add(434);
		set.add(42);
		set.add(-1);
		set.add(0);
		
		System.out.println(set);
		
		System.out.println("First element: " + set.first());
		System.out.println("Last element: " + set.last());
	}

}
