package a12_11_countVowels;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";
		System.out.println("Enter text:");
		String txt = scan.nextLine();
		
		int qVowels = 0;
		
		if (txt.equals("")) {
			System.out.println("Text not entered");
		} else {
			
			// Recórrer les vocals
			for (int i = 0;i<txt.length();i++) {
				char t = txt.charAt(i);
				// Recórrer el text
				for (int j = 0;j<vowels.length();j++) {
					// Comprova si el caràcter actual coincideix amb la vocal			
					char v = vowels.charAt(j);
					if(v==t) qVowels++;
					v = Character.toLowerCase(v);
					if(v==t) qVowels++;
				}
			}
			
			System.out.println("Quantity of vowels: "+qVowels);
		}
		scan.close();
	}
}
