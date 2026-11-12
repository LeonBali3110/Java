package a12_02_replaceSpaces;

import java.util.Scanner;

public class ReplaceSpaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = scan.nextLine();
		
		if(text.equals("")) {
			System.out.println("Text not entered");
		}else {
			int tLength = text.length();
			String nText = "";
			
			for (int i = 0;i<tLength;i++) {
				char value = text.charAt(i);
				if (Character.isWhitespace(value)) nText += "_";
				else nText+=value;
			}
			
			System.out.println(nText);
		}
		scan.close();

	}

}
