package unidade5;

import java.util.Scanner;

public class Uni5Exe08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Escolha um valor para nº de termos: ");
		int n = ler.nextInt();

		int termo = 0;
		int menorNegativo = 0;
		int somaPositivos = 0;
		int totalPositivos = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print(i + "º termo: ");
			termo = ler.nextInt();

			if (termo < 0 && termo < menorNegativo) {
				menorNegativo = termo;
			} else {
				somaPositivos += termo;
				totalPositivos++;
			}
		}

		System.out.print("Menor termo negativo: " + menorNegativo + "\nMédia dos termos positivos: " + (somaPositivos / totalPositivos));

		ler.close();

	}

}
