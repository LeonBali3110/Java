package a12_33_graphic3AscendingTriangle1;

import java.util.Scanner;

public class Graphic3AscendingTriangle1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter character:");
		String character = scan.nextLine();
		
		for(int i=1;i<=lines;i++) {
			
			for (int columns = i;0<columns;columns--) {
				System.out.print(character);
			}
			System.out.println("");
		}
		
		scan.close();

	}

}
