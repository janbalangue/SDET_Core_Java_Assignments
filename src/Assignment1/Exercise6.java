package Assignment1;

import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("This program calculates the area of a triangle.");
			
			System.out.println("Enter base:");
			double base = scanner.nextDouble();
			
			System.out.println("Enter height:");
			double height = scanner.nextDouble();
			
			double area = 0.5 * base * height;
			System.out.println("Area is " + area);
		}
	}

}
