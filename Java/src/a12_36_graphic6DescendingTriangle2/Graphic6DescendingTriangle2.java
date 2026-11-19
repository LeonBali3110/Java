package a12_36_graphic6DescendingTriangle2;

import java.util.Scanner;

public class Graphic6DescendingTriangle2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		
		scan.nextLine();
		
		System.out.println("Enter character:");
		String character = scan.nextLine();
		
		for(int i=1;i<=lines;i++) {
			
			for (int j = i;1<j;j--) {
				System.out.print(" ");
			}
			
			for (int j = lines;j>=i;j--) {
				System.out.print(character);
			}
			System.out.println("");
		}
		
		
		scan.close();

	}

}
