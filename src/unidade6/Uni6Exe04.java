package unidade6;

import java.util.Scanner;

public class Uni6Exe04 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler dois vetores de inteiros, cada um contendo 10
		 * elementos. Crie um terceiro vetor onde cada vetor é a soma dos valores
		 * contidos nas posições respectivas dos vetores originais. Exiba, ao final, os
		 * três vetores na tela. Faça três métodos: um método para ler os vetores, outro
		 * para somar e outro para escrever os vetores.
		 */

		Scanner ler = new Scanner(System.in);

		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int vetorSomaIndices[] = new int[10];
		String valoresIndicesVetores = "";
		for (int idx = 0; idx < 10; idx++) {
			System.out.print("Digite o " + (idx + 1) + "º valor para o primeiro vetor: ");
			vetor1[idx] = ler.nextInt();
			System.out.print("Digite o " + (idx + 1) + "º valor para o segundo vetor: ");
			vetor2[idx] = ler.nextInt();
			vetorSomaIndices[idx] = vetor1[idx] + vetor2[idx];
			valoresIndicesVetores += vetor1[idx] + " " + vetor2[idx] + " " + vetorSomaIndices[idx]
					+ "\n";
		}
		System.out.print(valoresIndicesVetores);
		
		ler.close();
	}

}
