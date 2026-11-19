package a11_04_guessPassword;

import java.util.Scanner;

public class GuessPassword {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Login as:");
		String user = scan.nextLine();
		if (user.equals("root") || user.equals("admin")) {
			user+="@211.174.173.184's password: ";
			String resposta = "";
			
			
			while (user.equals("admin@211.174.173.184's password: ")) {
				count++;
				System.out.println(user);
				resposta = scan.nextLine();
				if (resposta.equals("Fr34k!29$")) {
					break;
				}
			}
			while (user.equalsIgnoreCase("root@211.174.173.184's password: ")) {
				count++;
				System.out.println(user);
				resposta = scan.nextLine();
				if (resposta.equals("kL?Je45op")) break;
			}
		}
		else System.out.println("This user does not exist!");
			
			if (count!=0) System.out.printf("Welcome to Ubuntu 24.04.3 LTS. You have used %d attempts.", count);
			scan.close();
		}
	}
