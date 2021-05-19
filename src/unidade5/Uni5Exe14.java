package unidade5;

import java.util.Scanner;

public class Uni5Exe14 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nomeMercadoria = "";
		double lucro = 0;
		double precoVenda = 0;
		double precoCompra = 0;
		double totalPrecoVenda = 0;
		double totalPrecoCompra = 0;
		int lucroMenorQueDez = 0;
		int lucroMaiorIgualDez = 0;
		int lucroMaiorQueVinte = 0;

		for (int i = 1; i <= 20; i++) {
			System.out.print("Digite o nome da mercadoria: ");
			nomeMercadoria = ler.next();

			System.out.print("Digite o preço de compra: ");
			precoCompra = ler.nextDouble();
			totalPrecoCompra += precoCompra;

			System.out.print("Digite o preço de venda: ");
			precoVenda = ler.nextDouble();
			totalPrecoVenda += precoVenda;

			lucro = ((precoVenda - precoCompra) / precoCompra) * 100;

			if (lucro < 10) {
				lucroMenorQueDez++;
			} else if (lucro > 20) {
				lucroMaiorQueVinte++;
			} else {
				lucroMaiorIgualDez++;
			}
		}

		System.out.println("Lucro menor que 10%: " + lucroMenorQueDez + "\nLucro a partir de 10%:" + lucroMaiorIgualDez
				+ "\nLucro maior que 20%: " + lucroMaiorQueVinte + "\nTotal preço de compra: " + totalPrecoCompra
				+ "R$\nTotal preço de venda: " + totalPrecoVenda + "R$\nLucro total: "
				+ (totalPrecoVenda - totalPrecoCompra) + "R$");
		ler.close();
	}

}
