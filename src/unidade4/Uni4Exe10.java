package unidade4;

import java.util.Scanner;

public class Uni4Exe10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a idade de Marquinhos: ");
		int idMar = ler.nextInt();
		System.out.print("Digite a idade de Zezinho: ");
		int idZe = ler.nextInt();
		System.out.print("Digite a idade de Luluzinha: ");
		int idLulu = ler.nextInt();

		if (idMar < idZe && idMar < idLulu) {
			System.out.println("Marquinhos é o caçula da família.");
		} else {
			if (idZe < idMar && idZe < idLulu) {
				System.out.println("Zezinho é o caçula da família.");
			} else {
				System.out.println("Luluzinha é a caçula da família.");
			}
		}

		ler.close();

	}
}
