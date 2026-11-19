package a12_35_graphic5DescendingTriangle1;

import java.util.Scanner;

public class Graphic5DescendingTriangle1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter character:");
		String character = scan.nextLine();
		
		for(int i=1;i<=lines;i++) {
			
			for (int j = lines;i<=j;j--) {
				System.out.print(character);
			}
			System.out.println("");
		}
		
		scan.close();

	}

}
