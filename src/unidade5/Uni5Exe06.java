package unidade5;

import java.util.Scanner;

public class Uni5Exe06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double total = 0;
		
		for(int i = 1; i <= 20; i++) {
			System.out.print(i + "ª pessoa: ");
			double altura = ler.nextDouble();
			total = altura + total;
		}
		
		System.out.println("Média das alturas: " + (total/20));
		
		ler.close();
		
	}

}
