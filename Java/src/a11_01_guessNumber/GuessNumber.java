package a11_01_guessNumber;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int i = 0;
		int count = 1;
		int secretN = 7;
		
		
		while(i<=1) {
			System.out.println("Enter number of attempts (grater than 1):");
			i = scan.nextInt();
		}
		boolean acierto = false;
		int num = 0;
		
		
		for(;i>0;i--) {
			while(num>10 || num<1) {
				System.out.printf("Attempt %d: Enter your guess (1..10):\n", count);
				num = scan.nextInt();
			}
			count++;
			if (secretN<num) System.out.print("Too high. ");
			else if (num<secretN) System.out.print("Too low. ");
			else {
				acierto = true;
				break;
			}
			num = 0;
				
		}
		if(acierto) System.out.print("Correct! You guessed the number.");
		else System.out.printf("You lost! The secret number was %d.", secretN);
		scan.close();

	}

}
