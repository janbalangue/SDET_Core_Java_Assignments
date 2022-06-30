package Assignment1;

public class A1E9 {

	public static void main(String[] args) {
		
		System.out.println("This program displays even numbers between 1 and 50.\n");
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}	
}
