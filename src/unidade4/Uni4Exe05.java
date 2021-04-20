package unidade4;

import java.util.Scanner;

public class Uni4Exe05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("A cor é azul?");
		boolean cor = ler.hasNext();
		if (cor) {
			System.out.println("Sim.");
		} else {
			System.out.println("Não.");
		}
		ler.close();
	}

}
