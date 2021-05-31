package unidade6;

import java.util.Scanner;

public class Uni6Exe01 {
	
	Scanner ler;
	
	public Uni6Exe01() {
		ler = new Scanner(System.in);
		int[] vetor = new int[10];
		lerVetor(vetor);
		escreverVetor(vetor);
		ler.close();
	}
	
	public void lerVetor(int[] vetor) {
		for(int idx = 0; idx < vetor.length; idx++) {
			System.out.print("Digite um número: ");
			vetor[idx] = ler.nextInt();
		}		
	}
	
	public void escreverVetor(int[] vetor) {
		for(int idxInverso = vetor.length - 1; idxInverso >= 0 ; idxInverso--) {
			System.out.println(vetor[idxInverso]);
		}
	}
	public static void main(String[] args) {

		new Uni6Exe01();

	}

}
