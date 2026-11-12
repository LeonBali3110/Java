package a12_03_splitLettersDigits;

import java.util.Scanner;

public class SplitLettersDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter text:");
		String text = scan.nextLine();

		if (text.equals("")) {
			System.out.println("Text not entered");
		} else {
			String letters = "";
			String digits = "";

			int tLength = text.length();

			for (int i = 0; i < tLength; i++) {
				char value = text.charAt(i);
				if (Character.isLetter(value))
					letters += value;
				else if (Character.isDigit(value))
					digits += value;
			}

			System.out.println("Letters: " + letters);
			System.out.println("Digits: " + digits);
		}
		scan.close();
	}

}
