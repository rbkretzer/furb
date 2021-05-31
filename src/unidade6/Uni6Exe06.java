package unidade6;

import java.util.Scanner;

public class Uni6Exe06 {

	Scanner ler;
	
	public Uni6Exe06() {
		ler = new Scanner(System.in);
		System.out.print("Quantos números gostaria de armazenar? ");
		int tamanhoVetor = ler.nextInt();
		double[] vetor = new double[tamanhoVetor];
		lerVetor(vetor);
		boolean valorExiste = procuraValor(vetor);
		if (valorExiste) {
			System.out.println("O valor procurado encontra-se no vetor!");
		} else {
			System.out.println("O valor procurado não se encontra no vetor!");
		}
	}
	
	public void lerVetor(double[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor real: ");
			vetor[i] = ler.nextDouble();
		}
	}
	
	public boolean procuraValor(double[] vetor) {
		System.out.print("Digite um valor que deseja procurar: ");
		double valor = ler.nextDouble();
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valor) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		new Uni6Exe06();

	}

}
