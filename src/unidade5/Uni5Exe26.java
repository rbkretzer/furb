package unidade5;

import java.util.Scanner;

public class Uni5Exe26 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valorPedagio = 0;
		int distanciaTrecho = 0;
		int trechos = 1;
		int trechosAcima150AteValorLimite = 0;
		int trechosAcimaValorLimite = 0;

		System.out.print("Digite o valor limite a ser pago no pedágio: ");
		double valorLimite = ler.nextDouble();

		while (valorPedagio > -1) {
			System.out.print("Digite o valor do pedágio do " + trechos + "º trecho: ");
			valorPedagio = ler.nextDouble();
			System.out.print("Digite a distância percorrida no " + trechos + "º trecho: ");
			distanciaTrecho = ler.nextInt();
			trechos++;

			if (valorPedagio > valorLimite) {
				trechosAcimaValorLimite++;
			} else if (distanciaTrecho > 150) {
				trechosAcima150AteValorLimite++;
			}

		}

		System.out.println(trechosAcimaValorLimite + " trechos com valor acima do qual ele nega-se a pagar.\n" + trechos
				+ " quantidade de trechos informados.\n" + trechosAcima150AteValorLimite
				+ " trechos acima de 150km com valor aceito por ele.");

		ler.close();

	}

}
