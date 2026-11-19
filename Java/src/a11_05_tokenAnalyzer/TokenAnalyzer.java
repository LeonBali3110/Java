package a11_05_tokenAnalyzer;

import java.util.Scanner;

public class TokenAnalyzer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean funciona = true;
		int cSmall = 0;
		int cBig = 0;
		int rTokens = 0;
		long token = 0l;
		
		String nSmall = "";
		String nBig = "";
		String rejectedTokens = "";
		
		while (funciona) {
			System.out.println("Enter Token ID:");
			token = scan.nextLong();
			
			if (token>=64500 && token<=66700) {
				break;
			}
			if(token<=1000) {
				if (rTokens!=0) rejectedTokens += ", ";
				rTokens++;
				rejectedTokens += token;
				continue;
			}
			if(token<100000) {
				if (cSmall!=0) nSmall += ", ";
				cSmall++;
				nSmall += token;
				continue;
			}if (token>=100000) {
				if (cBig!=0) nBig += ", ";
				cBig++;
				nBig += token;
				continue;
			}
		}
		
		if (rTokens!=0) rejectedTokens = "(" + rejectedTokens + ")";
		if (cSmall!=0) nSmall = "(" + nSmall + ")";
		if (cBig!=0) nBig = "(" + nBig + ")";
		
		System.out.println("\nAnalysis statistics:");
		System.out.println("AI ALERT! Suspicious token detected: "+token);
		System.out.printf("Tokens smaller than 100000: %d %s\n", cSmall, nSmall);
		System.out.printf("Tokens bigger or equal than 100000: %d %s\n", cBig, nBig);
		System.out.printf("Rejected tokens: %d %s\n", rTokens, rejectedTokens);
		
		
		
		scan.close();

	}

}
