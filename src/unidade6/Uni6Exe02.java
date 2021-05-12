package unidade6;

import java.util.Scanner;

public class Uni6Exe02 {

	public static void main(String[] args) {

		/*
		 * Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
		 * 12 posi��es do tipo real. Imprima quais valores desses informados s�o maiores
		 * que a m�dia dos valores. Fa�a um m�todo para ler os valores, outro para
		 * calcular a m�dia e outro para informar os valores maiores que a m�dia.
		 */
		
		Scanner ler = new Scanner(System.in);
		
		double[] numeros = new double[12];
		
		double soma = 0;
		
		for (int idx = 0; idx < numeros.length; idx++) {
			System.out.print("Digite um valor real: ");
			numeros[idx] = ler.nextDouble();
			soma += numeros[idx];
		}
		
		double media = soma / numeros.length;
		
		String maioresQueMedia = "";
		for(int idx = 0; idx < numeros.length; idx++) {
			if(numeros[idx] > media) {
				maioresQueMedia += numeros[idx] + "\n";
			}
		}
		System.out.println(maioresQueMedia);
	}
}
