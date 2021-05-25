package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int numeroInscricao = 0;
		double alturaAtleta = 0;

		double maiorAltura = 0;
		int numeroInscricaoMaior = 0;
		double menorAltura = 0;
		int numeroInscricaoMenor = 0;
		double alturaAtletaAnterior = 0;
		double somaAlturas = 0;
		int totalAtletas = 0;

		System.out.print("Digite o número da inscrição do atleta: ");
		numeroInscricao = ler.nextInt();

		while (numeroInscricao != 0) {

			System.out.print("Digite a altura do atleta: ");
			alturaAtleta = ler.nextDouble();

			somaAlturas += alturaAtleta;

			if (alturaAtleta > alturaAtletaAnterior) {
				maiorAltura = alturaAtleta;
				numeroInscricaoMaior = numeroInscricao;
			}

			if (alturaAtleta < alturaAtletaAnterior) {
				menorAltura = alturaAtleta;
				numeroInscricaoMenor = numeroInscricao;
			}

			alturaAtletaAnterior = alturaAtleta;

			totalAtletas++;

			System.out.print("Digite o número da inscrição do atleta: ");
			numeroInscricao = ler.nextInt();

		}

		System.out.println("O atleta mais alto é o Nº " + numeroInscricaoMaior + " de " + maiorAltura
				+ "m de altura.\nO atleta mais baixo é o Nº " + numeroInscricaoMenor + " de " + menorAltura
				+ "m de altura.\nMédia da altura dos atletas: " + df.format((somaAlturas / totalAtletas)));

		ler.close();

	}

}
