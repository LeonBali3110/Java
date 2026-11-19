package a12_38_graphic8Rhombus;

import java.util.Scanner;

public class Graphic8Rhombus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter character:");
		String character = scan.nextLine();
		
		
		// Parte superior
		for(int i=1;i<=lines;i++) {
			
			for (int j = lines;i<j;j--) {
				System.out.print(" ");
			}
			for (int j = i-1;0<j;j--) {
				System.out.print(character);
			}
			for (int columns = i;0<columns;columns--) {
				System.out.print(character);
			}
			System.out.println("");
		}
		
		
		// Parte inferior
		for(int i=1;i<=lines;i++) {
			
			for (int j = i;0<j;j--) {
				System.out.print(" ");
			}
			
			for (int j = lines-1;j>=i;j--) {
				System.out.print(character);
			}
			for (int j = lines-1;i<j;j--) {
				System.out.print(character);
			}
			System.out.println("");
		}
		
		
		scan.close();


	}

}
