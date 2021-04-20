package unidade4;

import java.util.Scanner;

public class Uni4Exe09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("--------Digite dois valores inteiros--------");
		System.out.print("Primeiro valor: ");
		int valor1 = ler.nextInt();
		System.out.print("Segundo valor: ");
		int valor2 = ler.nextInt();

		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println("São múltiplos.");
		} else {
			System.out.println("Não são múltiplos");
		}

		ler.close();
	}

}
