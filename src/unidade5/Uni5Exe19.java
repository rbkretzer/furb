package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double valorTotalRecebido = 0;

		System.out.print("Digite o valor da compra: ");
		double valorCompra = ler.nextDouble();

		while (valorCompra != 0) {

			if (valorCompra > 500.0) {
				valorCompra *= 0.8;
			} else {
				valorCompra *= 0.85;
			}

			System.out.println("Valor a pagar: " + df.format(valorCompra));

			valorTotalRecebido += valorCompra;

			System.out.print("Digite o valor da compra: ");
			valorCompra = ler.nextDouble();
		}

		System.out.println("Valor toatal arrecadado no dia: " + df.format(valorTotalRecebido));

		ler.close();

	}

}
