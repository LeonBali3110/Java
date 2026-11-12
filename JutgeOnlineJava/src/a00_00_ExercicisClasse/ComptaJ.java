package a00_00_ExercicisClasse;
import java.util.Scanner;

public class ComptaJ {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter text:");
		String text = scan.nextLine();
		
		int jotas = 0;
		int size = text.length();
		
		for (int i = 0;i<size;i++) {
			char value = text.charAt(i);
			value = Character.toUpperCase(value);
			if (value == 'J') jotas++;
		}
		
		System.out.println("Jotas: "+jotas);
		
		scan.close();
	}
}
