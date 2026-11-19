package a12_20_uniqueVowels;

import java.util.Scanner;

public class UniqueVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = scan.nextLine();

		String letters = "AEIOUÀÈÒÙÁÉÍÓÚÄËÏÖÜÂÊÎÔÛ";
		
		char value1 =0;
		char value2 =0;

		String results = "";
		boolean forbidden = false;
		boolean charForbidden = false;

		// Cerca per text per trobar si text conté alguna lletra prohibida
		for (int i=0;i<text.length();i++) {
			value1 = text.charAt(i);
			
		        // Cerca per letters per trobar si és prohibida
			for (int j=0;j<letters.length();j++) {
				value2 = letters.charAt(j);
				
				
				value1 = Character.toUpperCase(value1);
				if (value1==value2) {	
					// Si és lletra prohibida cal sortir del bucle perquè ja s'ha trobat i no cal seguir comprovant		
					forbidden = true;
					charForbidden = true;
					break;
				}
			}
			// Si és lletra prohibida
			if (charForbidden) {
				charForbidden=false;
				char lForb=0;
				// Cerca si està a results per afegir-la si no hi és
				for (int l=0;l<results.length();l++) {
					lForb = results.charAt(l);
				
					// Si la lletra prohibida està a results, ja podem sortir del bucle
					if (lForb==value2) break;
				}
				// Si la lletra prohibida no està a results, afegir-la
				if (lForb!=value2) results+=value2;
			}
		}
		// Mostrar resultats	
		if (text=="") System.out.println("Text not entered");
		else{
			if (forbidden) {
			System.out.print("Unique vowels found: "+results);
		}
		else System.out.println("Text does not contain vowels");
		}
		scan.close();

	}

}
