package unidade6;

import java.util.Scanner;

public class Uni6Exe04 {
	Scanner ler;
	
	public Uni6Exe04() {
		ler = new Scanner(System.in);
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		lerVetores(vetor1, vetor2);
		int[] vetorSoma = somaVetores(vetor1, vetor2);
		imprimeVetores(vetor1, vetor2, vetorSoma);
		ler.close();
	}
	
	public void lerVetores(int[] vetor1, int[] vetor2) {
		for (int idx = 0; idx < 10; idx++) {
			System.out.print("Digite o " + (idx + 1) + "º valor para o primeiro vetor: ");
			vetor1[idx] = ler.nextInt();
			System.out.print("Digite o " + (idx + 1) + "º valor para o segundo vetor: ");
			vetor2[idx] = ler.nextInt();
			
		}
	}
	
	public int[] somaVetores(int[] vetor1, int[] vetor2) {
		int vetorSomaIndices[] = new int[10];
		for (int idx = 0; idx < 10; idx++) {
			vetorSomaIndices[idx] = vetor1[idx] + vetor2[idx];
		}
		return vetorSomaIndices;
	}
	
	public void imprimeVetores(int[] vetor1, int[] vetor2, int[] vetorSoma) {
		System.out.println(vetor1 + "\n" + vetor2 + "\n" + vetorSoma);
	}
		
	public static void main(String[] args) {
		new Uni6Exe04();
	}

}
