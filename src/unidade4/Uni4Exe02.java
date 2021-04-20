package unidade4;

import java.util.Scanner;

public class Uni4Exe02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int valor = ler.nextInt();
		if (valor % 2 == 0) {
			System.out.printf("O número %s é Par!", valor);
		} else {
			System.out.printf("O número %s é Ímpar!", valor);
		}
		ler.close();

	}
}
