package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Digite o valor do peso da carta em gramas: ");
		int pesoCarta = ler.nextInt();
		double valorTotal = 0;

		if (pesoCarta <= 50) {
			valorTotal = 0.45;
		} else {
			int qtdAdicional = 0;
			int pesoAdicional = pesoCarta - 50;
			if (pesoAdicional % 20 == 0) {
				qtdAdicional = pesoAdicional / 20;
			} else {
				qtdAdicional = (pesoAdicional / 20) + 1;
			}

			valorTotal = (qtdAdicional * 0.45) + 0.45;

		}

		System.out.println("O custo do selo será de: R$ " + df.format(valorTotal));

		ler.close();

	}
}
