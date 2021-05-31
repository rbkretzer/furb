package unidade6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe03 {

	Scanner ler;
	DecimalFormat df;
	public Uni6Exe03() {
		ler = new Scanner(System.in);
		df = new DecimalFormat("0.0000");
		double[] vetor = new double[12];
		lerVetor(vetor);
		alteraValoresVetor(vetor);
		escreveValoresAtualizados(vetor);
	}
	
	public void lerVetor(double[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor real: ");
			vetor[i] = ler.nextDouble();
		}
	}
	
	public void alteraValoresVetor(double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				vetor[i] *= 1.05;
			} else {
				vetor[i] *= 1.02;
			}
		}
	}
	
	public void escreveValoresAtualizados(double[] vetor) {
		String valoresVetor = "";
		for(int idx = 0; idx < vetor.length; idx++) {
			valoresVetor += df.format(vetor[idx]) + "\n";
		}
		System.out.println("Valores do vetor atulizados:\n" + valoresVetor);
	}
	
	public static void main(String[] args) {
		
		new Uni6Exe03();
		
	}

}
