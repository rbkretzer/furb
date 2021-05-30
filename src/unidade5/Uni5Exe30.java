package unidade5;

import java.util.Scanner;

public class Uni5Exe30 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o tamanho da mochila: ");
		int tamanhoMochila = ler.nextInt();
		while (tamanhoMochila < 0) {
			System.out.println("Valor inválido.");
			System.out.print("Digite o tamanho da mochila: ");
			tamanhoMochila = ler.nextInt();
		}

		System.out.print("Digite o valor inicial a ser colocado na mochila: ");
		int valorInicial = ler.nextInt();
		while (valorInicial < 0) {
			System.out.println("Valor inválido.");
			System.out.print("Digite o valor inicial a ser colocado na mochila: ");
			valorInicial = ler.nextInt();
		}

		System.out.print("Digite o valor de decremento: ");
		int valorDecremento = ler.nextInt();
		while (valorDecremento < 0) {
			System.out.println("Valor inválido.");
			System.out.print("Digite o valor de decremento: ");
			valorDecremento = ler.nextInt();
		}

		String elementos = "";
		String elementosNaMochila = "";
		int somaElementosNaMochila = 0;
		String elementosForaMochila = "";
		int somaElementosForaMochila = 0;

		while (valorInicial > 0) {
			tamanhoMochila -= valorInicial;
			if (tamanhoMochila > 0) {
				elementosNaMochila += valorInicial + "\n";
				somaElementosNaMochila += valorInicial;
			} else {
				elementosForaMochila += valorInicial + "\n";
				somaElementosForaMochila += valorInicial;
			}

			elementos += valorInicial + "\n";
			valorInicial -= valorDecremento;
		}

		System.out.println("Elementos a serem colocados na mochila: " + elementos + "\nElementos na mochila: " + elementosNaMochila
						+ "\nElementos fora da mochila: " + elementosForaMochila + "\nSoma elementos na mochila: "
						+ somaElementosNaMochila + "\nSoma elementos fora da mochila: " + somaElementosForaMochila);

		ler.close();

	}

}
