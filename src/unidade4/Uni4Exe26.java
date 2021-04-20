package unidade4;

import java.util.Scanner;

public class Uni4Exe26 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("--------Escolha uma das opções--------\n" + "T - Área triângulo\n" + "Q - Área quadrado\n"
				+ "R - Área retângulo\n" + "C - Área círculo\n");
		String opcao = ler.next();
		char opChar = opcao.toUpperCase().trim().charAt(0);

		double area = 0, b, h;
		switch (opChar) {
		case 'T':
			System.out.print("Digite o valor da base: ");
			b = ler.nextDouble();
			System.out.print("Digite o valor da altura: ");
			h = ler.nextDouble();
			area = (b * h) / 2;
			break;
		case 'Q':
			System.out.print("Digite o valor do lado: ");
			double l = ler.nextDouble();
			area = Math.pow(l, 2);
			break;
		case 'R':
			System.out.print("Digite o valor da base: ");
			b = ler.nextDouble();
			System.out.println("Digite o valor da altura: ");
			h = ler.nextDouble();
			area = b * h;
			break;
		case 'C':
			System.out.print("Digite o valor do raio ");
			double raio = ler.nextDouble();
			area = Math.PI * Math.pow(raio, 2);
			break;

		}
		if (area != 0) {
			System.out.println("Área: " + area);
		}

		ler.close();

	}

}
