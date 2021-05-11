package unidade5;

import java.util.Scanner;

public class Uni5Exe05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor maior que 2: ");
		int n = ler.nextInt();
		
		int termo = 8;
		
		if (n <= 2) {
			System.out.println("Valor inválido");
		} else {
			for (int i = 1; i <= n; i++) {
				System.out.println(i + "º termo: " + termo);
				if (i % 2 != 0) {
					termo += 2;
				} else {
					termo = (termo - 2)* 2;
				}
			}
		}
		
		ler.close();
		
	}

}
