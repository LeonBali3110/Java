package a12_12_mostFrequentChar;
import java.util.Scanner;

public class MostFrequentChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String txt = scan.nextLine();
		
		int major = 0;
		int actual = 0;
		char respuesta = 0;

		if (txt.equals("")) {
			System.out.println("Text not entered");
		} else {
			for (int i = 0;i<txt.length();i++) {
				char value1 = txt.charAt(i);
				actual = 0;
				
				for (int j = 0;j<txt.length();j++) {		
					char value2 = txt.charAt(j);
					
					if(value1==value2) actual++;
					if(major<actual) { 
						major=actual;
						respuesta = value2;
					}
				}
			}
			
			if (major==1)System.out.printf("Most freqüent character: '%c' appears 1 time", respuesta);
			else System.out.printf("Most freqüent character: '%c' appears %d times", respuesta, major);
		}
		scan.close();

	}

}
