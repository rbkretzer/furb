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
			System.out.println("Marquinhos � o ca�ula da fam�lia.");
		} else {
			if (idZe < idMar && idZe < idLulu) {
				System.out.println("Zezinho � o ca�ula da fam�lia.");
			} else {
				System.out.println("Luluzinha � a ca�ula da fam�lia.");
			}
		}

		ler.close();

	}
}
