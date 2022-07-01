package assignment4;

import java.util.Hashtable;
import java.util.Set;

public class A4E8 {

	public static void main(String[] args) {
		
		Hashtable<Integer, Boolean> hashtable = new Hashtable<>();
		
		hashtable.put(1, false);
		hashtable.put(2, true);
		hashtable.put(4, true);
		hashtable.put(13, false);
		hashtable.put(-20, true);
		
		Set<Integer> set = hashtable.keySet();
		
		System.out.println(set);
	}
}
