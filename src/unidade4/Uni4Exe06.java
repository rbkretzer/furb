package unidade4;

import java.util.Scanner;

public class Uni4Exe06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um carácter (M, F OU O): ");
		String letra = ler.next();
		letra = letra.toUpperCase().trim();

		char primeiraLetra = letra.charAt(0);

		if (primeiraLetra == 'M') {
			System.out.println("Masculino.");
		} else {
			if (primeiraLetra == 'F') {
				System.out.println("Feminino.");
			} else {
				if (primeiraLetra == 'O') {
					System.out.println("Outros.");
				} else {
					System.out.println("Entrada incorreta!!!");
				}
			}
		}

		ler.close();
	}

}
