package unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("--------Digite os anos de nascimento dos irm�os--------");
		System.out.print("Primeiro irm�o: ");
		int ano1 = ler.nextInt();
		System.out.print("Segundo irm�o: ");
		int ano2 = ler.nextInt();
		System.out.print("Terceiro irm�o: ");
		int ano3 = ler.nextInt();

		if (ano1 == ano2 && ano1 == ano3) {
			System.out.println("TRIG�MIOS");
		} else if (ano1 != ano2 && ano1 != ano3 && ano2 != ano3) {
			System.out.println("APENAS IRM�OS");
		} else {
			System.out.println("G�MIOS");
		}

		ler.close();

	}

}
