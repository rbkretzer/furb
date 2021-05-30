package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int dia = 0;
		int producaoManha = 0;
		int producaoTarde = 0;
		int producaoTotalDia = 0;
		int totalManha = 0;
		int totalTarde = 0;
		String periodoMaiorProducao = "";
		int maiorProducao = 0;
		int diaMaiorProducao = 0;
		int resposta = 0;
		double valorRecebido = 0;

		while (resposta != 2) {
			System.out.print("Digite o dia para calcular o valor di�rio: ");
			dia = ler.nextInt();

			while (dia < 1 || dia > 30) {
				System.out.println("Dia inv�lido.");
				System.out.print("Digite o dia para calcular o valor di�rio: ");
				dia = ler.nextInt();
			}

			System.out.print("Digite a quantidade produzida pelo funcion�rio no per�odo da manh�: ");
			producaoManha = ler.nextInt();
			System.out.print("Digite a quantidade produzida pelo funcion�rio no per�odo da tarde: ");
			producaoTarde = ler.nextInt();

			totalManha += producaoManha;
			totalTarde += producaoTarde;

			producaoTotalDia = (producaoManha + producaoTarde);

			/*
			 * Prof, eu n�o sabia se esse dia que occoreu a maio produ��o por dia era o
			 * somat�rio de todos os funcion�rios em determinado dia, mas eu n�o consegui
			 * imaginar uma forma de fazer esse somat�rio por dia somente com for e while,
			 * ent�o a minha solu�o foi separar por funcion�rio, portanto pe�o desculpas se
			 * eu estiver errado.
			 * 
			 */
			if (producaoTotalDia > maiorProducao) {
				maiorProducao = producaoTotalDia;
				diaMaiorProducao = dia;
			}

			if (dia <= 15 && producaoTotalDia > 100 && producaoManha > 30 && producaoTarde > 30) {
				valorRecebido = (producaoTotalDia * 0.80);
			} else if (dia > 15) {
				valorRecebido = (producaoManha * 0.40) + (producaoTarde * 0.30);
			} else {
				valorRecebido = (producaoTotalDia * 0.50);
			}

			System.out.println("R$ " + df.format(valorRecebido) + " (valor recebido).");

			System.out.print("Novo funcion�rio (1.sim 2.n�o)?");
			resposta = ler.nextInt();

			while (resposta < 1 || resposta > 2) {
				System.out.println("Valor inv�lido.");
				System.out.print("Novo funcion�rio (1.sim 2.n�o)?");
				resposta = ler.nextInt();
			}

		}

		if (totalManha > totalTarde) {
			periodoMaiorProducao = "Manh�.";
		} else {
			periodoMaiorProducao = "Tarde.";
		}

		System.out.println(
				"Dia de maior produ��o: " + diaMaiorProducao + "\nPer�odo de maior produ��o: " + periodoMaiorProducao);

		ler.close();
	}

}
