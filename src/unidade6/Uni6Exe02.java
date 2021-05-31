package unidade6;

import java.util.Scanner;

public class Uni6Exe02 {
	
	Scanner ler;
	
	public Uni6Exe02() {
		
		ler = new Scanner(System.in);
		double[] numeros = new double[12];
		lerVetor(numeros);
		double media = calculaMedia(numeros);
		valoresMaiorQueMedia(media, numeros);
		ler.close();
	}
	
	public void lerVetor(double[] numeros) {
		
		for (int idx = 0; idx < numeros.length; idx++) {
			System.out.print("Digite um valor real: ");
			numeros[idx] = ler.nextDouble();
		}
	}
	
	public double calculaMedia(double[] numeros) {
		double soma = 0;
		for (int idx = 0; idx < numeros.length; idx++) {
			soma += numeros[idx];
		}
		return soma / numeros.length;		
	}
	
	public void valoresMaiorQueMedia(double media, double[] numeros) {
		String maioresQueMedia = "";
		for(int idx = 0; idx < numeros.length; idx++) {
			if(numeros[idx] > media) {
				maioresQueMedia += numeros[idx] + "\n";
			}
		}
		System.out.println("Valores do vetor que são maior que a média deles:\n" + maioresQueMedia);		
	}
	
	public static void main(String[] args) {
		
		new Uni6Exe02();

	}
}
