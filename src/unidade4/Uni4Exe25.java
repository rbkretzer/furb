package unidade4;

import java.util.Scanner;

public class Uni4Exe25 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		double valor1 = ler.nextInt();
		System.out.print("Digite o valor 2: ");
		double valor2 = ler.nextInt();
		System.out.print("--------Escolha um tipo de pera��o--------\n" + "1 - Soma de dois n�meros.\n"
				+ "2 - Diferen�a entre dois n�meros.\n" + "3 - Produto entre dois n�meros.\n"
				+ "4 - Divis�o entre dois n�meros (o denominador n�o pode ser zero)." + "Op��o:");
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
			System.out.println("Op��o inv�lida");
		}

		if (opcao >= 1 || opcao <= 4) {
			System.out.println("Resultado: " + resultado);
		}

		ler.close();

	}

}
