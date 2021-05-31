package unidade6;

import java.util.Scanner;

public class Uni6Exe07 {

	Scanner ler;

	public Uni6Exe07() {
		ler = new Scanner(System.in);
		int[] vetor = new int[20];
		lerVetor(vetor);
		ordenarVetor(vetor);
		escreverVetorOrdenado(vetor);
	}

	public void lerVetor(int[] vetor) {
		int novoValor = 0;
		int totalVetor = 0;
		boolean temValor;
		for (int i = 0; i < vetor.length; i++) {
			do {
				temValor = false;
				System.out.print("Digite um valor para adicionar no vetor: ");
				novoValor = ler.nextInt();
				for (int x = 0; x < totalVetor; x++) {
					if (vetor[x] == novoValor) {
						System.out.println("Valor já pertence ao vetor.");
						temValor = true;
						break;
					}
				}
			} while (temValor);
			vetor[i] = novoValor;
			totalVetor++;
		}
	}

	public void ordenarVetor(int[] vetor) {
		int valorAntesTroca = 0;
		for (int i = 0; i < vetor.length; i++) {
			int posicao = (i + 1);
			for (int x = posicao; x < vetor.length; x++) {
				if (vetor[i] > vetor[posicao]) {
					valorAntesTroca = vetor[i];
					vetor[i] = vetor[posicao];
					vetor[posicao] = valorAntesTroca;
				}
				posicao++;
			}
		}
	}

	public void escreverVetorOrdenado(int[] vetor) {
		String numerosVetor = "";
		for (int i = 0; i < vetor.length; i++) {
			numerosVetor += vetor[i] + " ";
		}

		System.out.println("Vetor ordenado: " + numerosVetor);
	}

	public static void main(String[] args) {

		new Uni6Exe07();

	}

}
