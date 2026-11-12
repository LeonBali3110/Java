package a12_08_countUpperLowerCase;
import java.util.Scanner;

public class CountUpperLowerCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a text:");
		String txt =scan.nextLine();
		
		int upper = 0;
		int lower = 0;
		
		
		if(txt.equals("")) {
			System.out.println("Text not entered");
		}else {
			int size = txt.length();
			for(int i=0;i<size;i++) {
				char value = txt.charAt(i);
				if (Character.isUpperCase(value)) upper++;
				else if (Character.isLowerCase(value)) lower++;
			}
			
			System.out.println("Uppercase = "+upper);
			System.out.println("Lowercase = "+lower);
		}
		scan.close();

	}

}
