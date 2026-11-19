package a00_00_ExercicisClasse;

import java.util.Scanner;

public class BuscaA {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Posa un text: ");
		String txt = scan.nextLine();
		int count = 0;
		
		boolean conteA = false;
		
		for(int i = 0;i<txt.length();i++) {
			if(txt.charAt(i)=='a') {
				conteA = true;
				count++;
				break;
			}
			count++;
			
		}
		if (conteA) System.out.println("La primera a se ubica en "+count);
		
		scan.close();

	}

}
