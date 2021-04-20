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

		int idx0, idx1, idx2;

		if (valor1 < valor2 && valor1 < valor3) {
			idx2 = valor1;
		} else {
			if (valor2 < valor1 && valor2 < valor3) {
				idx2 = valor2;
			} else {
				idx2 = valor3;
			}
		}
		if ((valor1 > valor2 && valor1 < valor3) || (valor1 > valor3 && valor1 < valor2)) {
			idx1 = valor1;
		} else {
			if ((valor2 > valor1 && valor2 < valor3) || (valor2 > valor3 && valor2 < valor1)) {
				idx1 = valor2;
			} else {
				idx1 = valor3;
			}
		}
		if (valor1 > valor2 && valor1 > valor3) {
			idx0 = valor1;
		} else {
			if (valor2 > valor1 && valor2 > valor3) {
				idx0 = valor2;
			} else {
				idx0 = valor3;
			}
		}

		switch (opcao) {
		case 1:
			System.out.println(idx2 + "\n" + idx1 + "\n" + idx0);
			break;
		case 2:
			System.out.println(idx0 + "\n" + idx1 + "\n" + idx2);
			break;
		case 3:
			if (valor1 > valor2 && valor1 > valor3) {
				idx1 = valor1;
				idx0 = valor2;
				idx2 = valor3;

			} else {
				if (valor2 > valor1 && valor2 > valor3) {
					idx0 = valor1;
					idx1 = valor2;
					idx2 = valor3;
				} else {
					idx0 = valor1;
					idx1 = valor3;
					idx2 = valor2;
				}
			}
			System.out.println(idx0 + "\n" + idx1 + "\n" + idx2);
			break;
		default:
			System.out.println("Opção inválida");
		}

		ler.close();

	}

}
