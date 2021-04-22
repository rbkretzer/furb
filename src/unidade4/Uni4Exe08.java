package unidade4;

import java.util.Scanner;

public class Uni4Exe08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String entrada = ler.next().trim().toUpperCase();
		char letra = entrada.charAt(0);

		switch(letra) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': System.out.println("É vogal!!");
		break;
		default: System.out.println("É consoante!!");
		
			
		}
		ler.close();
	}

}
