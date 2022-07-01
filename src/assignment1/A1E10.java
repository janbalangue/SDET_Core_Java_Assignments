package assignment1;

public class A1E10 {
	
	public static void main(String[] args) {	
	
		System.out.println("This program prints a triangle from a 2D array.\n");
		
		String[][] triangle = {
				{"0"},
				{"0", "0"},
				{"0", "0", "0"},
				{"0", "0", "0", "0"},
				{"0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0", "0", "0", "0"}
		};
		
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j]);
			}
			System.out.println();
		}
	}	
}
