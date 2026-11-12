package a12_06_firstAndLastLetter;
import java.util.Scanner;

public class FirstAndLastLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word ="";
		
		String allWords = "";
		int tWords = 0;
		
		while (!word.equalsIgnoreCase("END")) {
			System.out.println("Enter word:");
			word = scan.nextLine();
			
			if (!word.equalsIgnoreCase("END")) {
				char first = word.charAt(0);
				first = Character.toLowerCase(first);
				int l = word.length() - 1;
				char last = word.charAt(l);
				last = Character.toLowerCase(last);
				
				
				if(Character.isLetter(last) && Character.isLetter(first) && l!=0 && first == last){
					tWords++;
					allWords = allWords + "\n" +word;
				}
			}
			
		}
		
		if (tWords == 0) System.out.print("No words entered");
		else {
			System.out.print("Total words: "+tWords);
			System.out.print(allWords);
		}
		scan.close();
	}

}
