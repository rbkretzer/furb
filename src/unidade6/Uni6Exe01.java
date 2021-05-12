package unidade6;

import java.util.Scanner;

public class Uni6Exe01 {

	public static void main(String[] args) {

		/*
		 * Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros e os
		 * coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa
		 * em que foram lidos. Faça um método para ler e outro para escrever.
		 * 
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		for(int idx = 0; idx < vetor.length; idx++) {
			System.out.print("Digite um número: ");
			vetor[idx] = ler.nextInt();
		}
		
		for(int idxInverso = vetor.length - 1; idxInverso >= 0 ; idxInverso--) {
			System.out.println(vetor[idxInverso]);
		}
		
		ler.close();
		
	}

}
