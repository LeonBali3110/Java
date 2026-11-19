package a12_07_removeRepeatedLetters;

import java.util.Scanner;

public class RemoveRepeatedLetters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a text:");
		String txt = scan.nextLine();

		if (txt.equals("")) {
			System.out.println("Text not entered");
		} else {
			String cleanTxt = "";
			int l = txt.length();
			
			for (int i=0;i<l;i++) {
				char value = txt.charAt(i);
				char pValue = 0;
				
				if (i!=0) pValue = txt.charAt(i-1);
				
				if (value!=pValue) cleanTxt+=value;
			}
			
			System.out.printf("Clean text: %s", cleanTxt);
		}
		
		scan.close();

	}

}