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
			System.out.print("Digite o dia para calcular o valor diário: ");
			dia = ler.nextInt();

			while (dia < 1 || dia > 30) {
				System.out.println("Dia inválido.");
				System.out.print("Digite o dia para calcular o valor diário: ");
				dia = ler.nextInt();
			}

			System.out.print("Digite a quantidade produzida pelo funcionário no período da manhã: ");
			producaoManha = ler.nextInt();
			System.out.print("Digite a quantidade produzida pelo funcionário no período da tarde: ");
			producaoTarde = ler.nextInt();

			totalManha += producaoManha;
			totalTarde += producaoTarde;

			producaoTotalDia = (producaoManha + producaoTarde);

			/*
			 * Prof, eu não sabia se esse dia que occoreu a maio produção por dia era o
			 * somatório de todos os funcionários em determinado dia, mas eu não consegui
			 * imaginar uma forma de fazer esse somatório por dia somente com for e while,
			 * então a minha soluão foi separar por funcionário, portanto peço desculpas se
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

			System.out.print("Novo funcionário (1.sim 2.não)?");
			resposta = ler.nextInt();

			while (resposta < 1 || resposta > 2) {
				System.out.println("Valor inválido.");
				System.out.print("Novo funcionário (1.sim 2.não)?");
				resposta = ler.nextInt();
			}

		}

		if (totalManha > totalTarde) {
			periodoMaiorProducao = "Manhã.";
		} else {
			periodoMaiorProducao = "Tarde.";
		}

		System.out.println(
				"Dia de maior produção: " + diaMaiorProducao + "\nPeríodo de maior produção: " + periodoMaiorProducao);

		ler.close();
	}

}
