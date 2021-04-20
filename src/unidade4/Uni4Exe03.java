package unidade4;

import java.util.Scanner;

public class Uni4Exe03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("---------------------------Digite dois valores inteiros---------------------------");
		System.out.print("Primeiro valor: ");
		int valor1 = ler.nextInt();
		System.out.print("Segundo valor: ");
		int valor2 = ler.nextInt();

		System.out.println("----------------------------------------------------------------------------------");
		if (valor1 > valor2) {
			System.out.printf("O número %s é maior que %s.", valor1, valor2);
		} else {
			System.out.printf("O número %s é maior que %s.", valor2, valor1);
		}

		ler.close();
	}

}
