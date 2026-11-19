package a12_15_textWithMaxVowels;

import java.util.Scanner;

public class TextWithMaxVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String vowels = "AÀÁÄÂEÈÉËÊIÍÌÏÎOÒÓÖÔUÙÚÜÛ";
		String txt = "Hola";
		String txtRes = "";
		int qVowels = 0;
		int maxVowels = 0;
		
		System.out.println("Enter text (enter to finish):");
		txt = scan.nextLine();
		
		if(txt.equals("")) System.out.println("Text not entered");
		else {
		
			while (!txt.equals("")) {
				qVowels=0;
				
				for (int i = 0;i<txt.length();i++) {
					char t = txt.charAt(i);
					for (int j = 0;j<vowels.length();j++) {
						char v = vowels.charAt(j);
						if(v==t) qVowels++;
						v = Character.toLowerCase(v);
						if(v==t) qVowels++;
					}
				}
				if (maxVowels<qVowels) {
					maxVowels=qVowels;
					txtRes = txt;
				}
				if (maxVowels==qVowels && !txt.equals(txtRes)) txtRes = txtRes+", "+txt;
				
				System.out.println("Enter text (enter to finish):");
				txt = scan.nextLine();
			}
			System.out.printf("Quantity of vowels: %d \nText: %s",maxVowels, txtRes);
		}
		
		scan.close();

	}

}
