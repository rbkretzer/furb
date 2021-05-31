package unidade6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni6Exe08 {
	
	Scanner ler;
	DecimalFormat df;
	
	public Uni6Exe08() {
		ler = new Scanner(System.in);
		df = new DecimalFormat("0.0000");
		int tamanhoVetor = tamanhoVetor();
		double[] vetor = new double[tamanhoVetor];
		lerVetor(vetor);
		agruparValores(vetor);
	}
	
	public int tamanhoVetor() {
		System.out.print("Quanto valores reais que você deseja armazenar (máx. 20 valores)? ");
		int tamanhoVetor = ler.nextInt();
		while (tamanhoVetor < 0 || tamanhoVetor > 20) {
			System.out.println("Quantidade inválida.");
			System.out.print("Quanto valores reais que você deseja armazenar (máx. 20 valores)? ");
			tamanhoVetor = ler.nextInt();			
		}
		
		return tamanhoVetor;
	}
	
	public void lerVetor(double[] vetor) {
		double valor = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			valor = ler.nextDouble();
			vetor[i] = valor;
		}
	}
	
	public void agruparValores(double[] vetor) {
		ordenarValores(vetor);
		String tabela = "";
		int posicoesPosteriores = 0;
		int quantValor = 0;
		for (int count = 0; count < vetor.length; count++) {
			posicoesPosteriores = count + 1;
			quantValor = 1;
			while (posicoesPosteriores < vetor.length && vetor[count] == vetor[posicoesPosteriores]) {
				quantValor++;
				posicoesPosteriores++;
			}
			tabela += vetor[count] + " - " + quantValor + "\n";
			count = posicoesPosteriores - 1;
		}
		
		System.out.println(tabela);
		
	}
	
	public void ordenarValores(double[] vetor) {
		double valorAntesTroca = 0;
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
	
	
	public static void main(String[] args) {
		
		new Uni6Exe08();

	}

}
