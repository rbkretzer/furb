package unidade4;

import java.util.Scanner;

public class Uni4Exe13 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor das três cartas");
		System.out.print("Primeira carta: ");
		int carta1 = ler.nextInt();
		System.out.print("Segunda carta: ");
		int carta2 = ler.nextInt();
		System.out.print("Terceira carta: ");
		int carta3 = ler.nextInt();

		if (carta1 < 4 && carta2 < 4 && carta3 < 4) {
			System.out.println("NOVE");
		} else {
			if (carta1 < 4 && carta2 < 4 || carta1 < 4 && carta3 < 4 || carta2 < 4 && carta3 < 4) {
				System.out.println("SEIS");
			} else {
				System.out.println("TRUCO");
			}
		}

		ler.close();
	}

}
