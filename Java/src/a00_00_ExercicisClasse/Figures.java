package a00_00_ExercicisClasse;

import java.util.Scanner;

public class Figures {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		int count = lines;
		
		System.out.println("Exercici 1");
		for(int i = 1;i<=lines;i++) {
			count--;
			for (int j = 0;j<lines;j++) {
				System.out.print(j+1);
				if (j==count) break;
			}
			System.out.println("");
		}
		
		System.out.println("Exercici 2");
		for(int i = 1;i<=lines;i++) {
			for (int ast=lines-1;ast>=i;ast--) {
				System.out.print("*");
			}
			for (int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
		scan.close();

	}

}
