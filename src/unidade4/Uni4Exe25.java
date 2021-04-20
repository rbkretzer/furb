package unidade4;

import java.util.Scanner;

public class Uni4Exe25 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		double valor1 = ler.nextInt();
		System.out.print("Digite o valor 2: ");
		double valor2 = ler.nextInt();
		System.out.print("--------Escolha um tipo de peração--------\n" + "1 - Soma de dois números.\n"
				+ "2 - Diferença entre dois números.\n" + "3 - Produto entre dois números.\n"
				+ "4 - Divisão entre dois números (o denominador não pode ser zero)." + "Opção:");
		int opcao = ler.nextInt();

		double resultado = 0;

		switch (opcao) {
		case 1:
			resultado = valor1 + valor2;
			break;
		case 2:
			resultado = valor1 - valor2;
			break;
		case 3:
			resultado = valor1 * valor2;
			break;
		case 4:
			resultado = valor1 / valor2;
			break;
		default:
			System.out.println("Opção inválida");
		}

		if (opcao >= 1 || opcao <= 4) {
			System.out.println("Resultado: " + resultado);
		}

		ler.close();

	}

}
