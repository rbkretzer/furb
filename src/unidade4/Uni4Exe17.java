package unidade4;

import java.util.Scanner;

public class Uni4Exe17 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a sua renda anual: ");
		double renda = ler.nextDouble();
		System.out.println("Digite o seu número de dependentes: ");
		int dependentes = ler.nextInt();

		double rendaLiquida = renda - (dependentes * 0.2);

		double ir;

		if (rendaLiquida > 2000) {
			if (rendaLiquida > 5000) {
				if (rendaLiquida > 10000) {
					ir = rendaLiquida * 0.15;
				} else {
					ir = rendaLiquida * 0.1;
				}
			} else {
				ir = rendaLiquida * 0.05;
			}
		} else {
			ir = 0;
		}
		if (ir == 0) {
			System.out.println("Isento do imposto de renda.");
		} else {
			System.out.printf("Seu imposto de renda será de: R$ %s", ir);
		}

		ler.close();

	}

}
