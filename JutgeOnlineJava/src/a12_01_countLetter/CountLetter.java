package a12_01_countLetter;

import java.util.Scanner;

public class CountLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;

		System.out.println("Enter text:");
		String word = scan.nextLine();

		if (word.equals("")) {
			System.out.println("Text not entered");
		} else {
			System.out.println("Enter letter: ");
			String lletra = scan.nextLine();

			char incognita = lletra.charAt(0);

			int wLenght = word.length();

			for (int i = 0; i < wLenght; i++) {
				char letter = word.charAt(i);

				if (Character.toLowerCase(letter) == Character.toLowerCase(incognita))
					count++;
			}

			System.out.println("Occurrences: " + count);

			scan.close();
		}
	}
}
