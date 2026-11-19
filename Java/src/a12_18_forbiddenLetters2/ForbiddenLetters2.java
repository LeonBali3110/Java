package a12_18_forbiddenLetters2;

import java.util.Scanner;

public class ForbiddenLetters2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a text:");
		String text = scan.nextLine();

		String letters = "çñwzqx";

		String results = "";
		boolean forbidden = false;
		boolean charForbidden = false;

		// Cerca per text per trobar si text conté alguna lletra prohibida
		for (int i=0;i<text.length();i++) {
			char value1 = text.charAt(i);
			
		        // Cerca per letters per trobar si és prohibida
			for (int j=0;j<letters.length();j++) {
				char value2 = letters.charAt(j);
				
				if (value1==value2) {	
					// Si és lletra prohibida cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant		
					forbidden = true;
					charForbidden = true;
					break;
				}
				
				value2 = Character.toUpperCase(value2);
				if (value1==value2) {	
					// Si és lletra prohibida cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant		
					forbidden = true;
					charForbidden = true;
					break;
				}
				
			}
			// Actualitzar si cal results
			if (charForbidden) {
				results+=value1;
				charForbidden = false;
			}
		}
		// Mostrar resultats	
		if (forbidden) {
			System.out.println("Text contains special letters");
			System.out.print("Forbidden letters: "+results);
		}
		else System.out.println("Text does not contain special letters");
		
		
		scan.close();
	}

}
