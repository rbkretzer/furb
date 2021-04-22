package unidade4;

import java.util.Scanner;

public class Uni4Exe24 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor 1: ");
		int valor1 = ler.nextInt();
		System.out.print("Digite o valor 2: ");
		int valor2 = ler.nextInt();
		System.out.print("Digite o valor 3: ");
		int valor3 = ler.nextInt();

		System.out.print("--------Escolha a ordenação--------\n" + "1 - Crescente.\n" + "2 - Decrescente.\n"
				+ "3 - Maior no meio.\n" + "Opção: ");

		int opcao = ler.nextInt();

		int valorAlto, valorMedio, valorBaixo;

		if (valor1 < valor2 && valor1 < valor3) {
			valorBaixo = valor1;
		} else if (valor2 < valor1 && valor2 < valor3) {
			valorBaixo = valor2;
		} else {
			valorBaixo = valor3;
		}

		if ((valor1 > valor2 && valor1 < valor3) || (valor1 > valor3 && valor1 < valor2)) {
			valorMedio = valor1;
		} else if ((valor2 > valor1 && valor2 < valor3) || (valor2 > valor3 && valor2 < valor1)) {
			valorMedio = valor2;
		} else {
			valorMedio = valor3;
		}

		if (valor1 > valor2 && valor1 > valor3) {
			valorAlto = valor1;
		} else if (valor2 > valor1 && valor2 > valor3) {
			valorAlto = valor2;
		} else {
			valorAlto = valor3;
		}

		switch (opcao) {
		case 1:
			System.out.println(valorBaixo + "\n" + valorMedio + "\n" + valorAlto);
			break;
		case 2:
			System.out.println(valorAlto + "\n" + valorMedio + "\n" + valorBaixo);
			break;
		case 3:
			if (valorAlto == valor1) {
				System.out.println(valor2+ "\n" + valorAlto + "\n" + valor3);
			} else if (valorAlto == valor2) {
				System.out.println(valor1+ "\n" + valorAlto + "\n" + valor3);
			} else {
				System.out.println(valor1+ "\n" + valorAlto + "\n" + valor2);
			}
			break;
		default:
			System.out.println("Opção inválida");
		}

		ler.close();

	}

}
