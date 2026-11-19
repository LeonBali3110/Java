package a12_17_forbiddenLetters1;

import java.util.Scanner;

public class ForbiddenLetters1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a text:");
		String text = scan.nextLine();

		String letters = "çñwzqx";
		
		boolean forbidden = false;

		// Cerca per text per trobar si text conté alguna lletra prohibida
		for (int i=0;i<text.length();i++) {
			char value1 = text.charAt(i);
			
		        // Cerca per letters per trobar si és prohibida
			for (int j=0;j<letters.length();j++) {
				char value2 = letters.charAt(j);
				
				value1 = Character.toUpperCase(value1);
				value2 = Character.toUpperCase(value2);
				if (value1==value2) {	
					// Si és lletra prohibida cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant		
					forbidden = true;
					break;
				}
			}
			if (forbidden) break;
		}
		// Mostrar resultats
		if (forbidden) System.out.println("Text contains special letters");
		else System.out.println("Text does not contain special letters");
		
		scan.close();
	}

}
