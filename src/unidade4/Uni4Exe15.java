package unidade4;

import java.util.Scanner;

public class Uni4Exe15 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int mesesAdmissao = ler.nextInt();

		if (mesesAdmissao < 13) {
			System.out.println("Valor de reajuste salarial será de 5%");
		} else {
			if (mesesAdmissao < 49) {
				System.out.println("Valor de reajuste salarial será de 7%");
			} else {
				System.out.println("Não haverá reajuste salarial.");
			}
		}

		ler.close();

	}

}
