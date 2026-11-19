package a12_10_palindromeChecker;
import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter word:");
		String txt = scan.nextLine();
		String reverse = "";
		
		if (txt.equals("")) System.out.println("Word not entered");
		else {
		
			boolean palindrome = false;
			
			int l = txt.length();
			
			for (int i =l-1;0<=i;i--) {
				char value = txt.charAt(i);
				reverse+=value;
			}
			
			if (txt.equalsIgnoreCase(reverse)) palindrome = true;
				
			System.out.println("Palindrome: "+palindrome);
		}
		
		scan.close();
	}

}
