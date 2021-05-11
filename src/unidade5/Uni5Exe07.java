package unidade5;

import java.util.Scanner;

public class Uni5Exe07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escolha um valor para nº de termos: ");
		int n = ler.nextInt();
		 
		double valor = 0;
		double menor = 0;
		double maior = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print(i+"º valor: ");
			valor = ler.nextDouble();
			
			if (valor < menor) {
				menor = valor;
			}
			if (valor > maior) {
				maior = valor;
			}
		}
		
		System.out.println("O menor valor é: " + menor + "\nO maior valor é: " + maior);
		
		ler.close();

	}

}
