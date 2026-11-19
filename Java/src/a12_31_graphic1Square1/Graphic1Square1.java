package a12_31_graphic1Square1;
import java.util.Scanner;

public class Graphic1Square1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int lines = scan.nextInt();
		int or = lines;
		
		scan.nextLine();
		
		System.out.println("Enter character:");
		String character = scan.nextLine();
		
		for(;0<lines;lines--) {
			
			for (int columns = or;0<columns;columns--) {
				System.out.print(character);
			}
			System.out.println("");
		}
		
		scan.close();
	}

}
