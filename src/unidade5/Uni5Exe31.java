package unidade5;

import java.util.Scanner;

public class Uni5Exe31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número para fazer o MMC: ");
		int numero = ler.nextInt();

		int divisor = 2;

		while (numero > 1) {
			while (numero % divisor != 0) {
				divisor++;
			}

			if (numero % divisor == 0) {
				System.out.println(numero + " - " + divisor);
				numero /= divisor;
			}
		}
		System.out.println(numero);
		ler.close();
	}

}
