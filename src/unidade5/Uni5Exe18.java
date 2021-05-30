package unidade5;

import java.util.Scanner;

public class Uni5Exe18 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int totalQuantAudiencia = 0;
		int somaAudienciaCanal4 = 0;
		int somaAudienciaCanal5 = 0;
		int somaAudienciaCanal9 = 0;
		int somaAudienciaCanal12 = 0;
		int numeroPessoas = 0;

		System.out.print("Digite o número do canal:");
		int numeroCanal = ler.nextInt();

		while (numeroCanal != 0) {

			System.out.print("Digite o número de pessoas assistindo a TV: ");
			numeroPessoas = ler.nextInt();

			switch (numeroCanal) {
				case 4: somaAudienciaCanal4 += numeroPessoas;
				case 5: somaAudienciaCanal5 += numeroPessoas;
				case 9: somaAudienciaCanal9 += numeroPessoas;
				case 12: somaAudienciaCanal12 += numeroPessoas;
			}

			totalQuantAudiencia += numeroPessoas;

			System.out.print("Digite o número do canal:");
			numeroCanal = ler.nextInt();

		}

		double audiencia4 = (somaAudienciaCanal4 / totalQuantAudiencia) * 100;
		double audiencia5 = (somaAudienciaCanal5 / totalQuantAudiencia) * 100;
		double audiencia9 = (somaAudienciaCanal9 / totalQuantAudiencia) * 100;
		double audiencia12 = (somaAudienciaCanal12 / totalQuantAudiencia) * 100;

		System.out.println("Percentual audiência canal 4: " + audiencia4 + "%\nPercentual audiência canal 5: "
				+ audiencia5 + "%\nPercentual audiência canal 9: " + audiencia9 + "%\nPercentual audiência canal 12: "
				+ audiencia12);

		ler.close();

	}

}
