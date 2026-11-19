package a12_39_graphic14PyramidRandom;

import java.util.Scanner;

public class Graphic9PyramidRandom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		
		String letters = "+~ox*O";
		
		int count=0;
		
		
		for(int i=1;i<=lines;i++) {
			
			
			for (int j = lines;i<j;j--) {
				System.out.print(" ");
			}
			
			
			for (int j = i-1;0<j;j--) {
				int randomNum = (int)(Math.random() * 5)+1;
				char character = letters.charAt(randomNum);
				System.out.print(character);
			}
			for (int columns = i;0<columns;columns--) {
				if (count==0) {
					System.out.print("\u2605");
					count++;
					continue;
				}
				int randomNum = (int)(Math.random() * 5)+1;
				char character = letters.charAt(randomNum);
				System.out.print(character);
			}
			System.out.println("");
		}
		
		scan.close();
	}

}
