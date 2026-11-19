package a12_09_longestText;
import java.util.Scanner;

public class LongestText {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a text (END to finish):");
		String txt = scan.nextLine();
		int l = 0;
		int longestTxt = 0;
		String biggestTxt = "";
		
		while(!txt.equalsIgnoreCase("end")) {
			l = txt.length();
			
			if (longestTxt<l) {
				longestTxt = l;
				biggestTxt = txt;
			}
			
			System.out.println("Enter a text (END to finish):");
			txt = scan.nextLine();
		}
		
		if (longestTxt == 0) System.out.print("Text not entered");
		else System.out.printf("Longest text length: %d \nText: %s", longestTxt, biggestTxt);
		
		
		scan.close();

	}

}
