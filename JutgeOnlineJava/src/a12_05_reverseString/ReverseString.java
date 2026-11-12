package a12_05_reverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a text:");
		String txt = scan.nextLine();
		
		String reverse = "";
		if(txt.equals("")) {
			System.out.println("Text not entered");
		}else {
			int size = txt.length();
			for(int i = size-1;0<=i;i--) {
				char value = txt.charAt(i);
				reverse+=value;
			}
			
			System.out.print(reverse);
		}
			
		scan.close();
	}
}
