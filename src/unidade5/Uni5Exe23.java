package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe23 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		boolean continua = true;
		String relatorio = "";
		String nome = "";
		double totalVendas = 0;
		double salario = 0;
		double valorProduto = 0;
		int qtdVendidaProduto = 0;
		int produtosVendidos = 0;

		while (continua) {
			System.out.print("Digite o nome do funcionário: ");
			nome = ler.nextLine();
			System.out.print("Digite quantos produtos " + nome + " vendeu: ");
			produtosVendidos = ler.nextInt();

			for (int i = 1; i <= produtosVendidos; i++) {
				System.out.print("Digite o valor do " + i + "º produto: ");
				valorProduto = ler.nextDouble();
				System.out.print("Digite a quantidade vendida do " + i + "º produto: ");
				qtdVendidaProduto = ler.nextInt();

				totalVendas += (valorProduto * qtdVendidaProduto);
			}

			salario = totalVendas * 0.3;

			relatorio += "--------" + nome + "--------\nTotal de vendas: " + df.format(totalVendas) + "R$\nSalário: "
					+ df.format(salario) + "R$\n";

			System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)? ");
			char resposta = ler.next().trim().toLowerCase().charAt(0);

			if (resposta == 's') {
				continua = true;
				ler.nextLine();
			} else {
				continua = false;
			}
		}

		System.out.println(relatorio);

		ler.close();
	}

}
