package unidade4;

import java.util.Scanner;

public class Uni4Exe06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um carácter (M, F OU O): ");
		String letra = ler.next();
		letra = letra.toUpperCase().trim();

		char primeiraLetra = letra.charAt(0);

		switch (primeiraLetra) {
		case 'M':
			System.out.println("Masculino.");
			break;
		case 'F':
			System.out.println("Feminino.");
			break;
		case 'O':
			System.out.println("Outros.");
			break;
		default:
			System.out.println("Entrada inválida.");
		}

		ler.close();

	}

}
