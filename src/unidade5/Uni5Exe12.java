package unidade5;

import java.util.Scanner;

public class Uni5Exe12 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite quantas linhas você gostaria que apareça no Triângulo de Floyd: ");
		int linhas = ler.nextInt();
		int valorAtual = 0;
		
		String linha = "";
		
		for(int i = 1; i <= linhas; i++) {
			for (int count = 1; count <= i; count++) {
				valorAtual++; 
				linha += valorAtual + " ";
			}
			System.out.println(linha);
		}

	}

}
