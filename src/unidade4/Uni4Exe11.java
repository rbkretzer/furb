package unidade4;

import java.util.Scanner;

public class Uni4Exe11 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("--------Digite os anos de nascimento dos irmãos--------");
		System.out.print("Primeiro irmão: ");
		int ano1 = ler.nextInt();
		System.out.print("Segundo irmão: ");
		int ano2 = ler.nextInt();
		System.out.print("Terceiro irmão: ");
		int ano3 = ler.nextInt();

		if (ano1 == ano2 && ano1 == ano3) {
<<<<<<< HEAD
			System.out.println("TRIG�MIOS");
		} else if (ano1 != ano2 && ano1 != ano3 && ano2 != ano3) {
			System.out.println("APENAS IRM�OS");
		} else {
			System.out.println("G�MIOS");
=======
			System.out.println("TRIGÊMIOS");
		} else {
			if (ano1 != ano2 && ano1 != ano3 && ano2 != ano3) {
				System.out.println("APENAS IRMÃOS");
			} else {
				System.out.println("GÊMEOS");
			}
>>>>>>> 3d28beb93c5fb2fd72029ec4b8ba4684ea26ce8a
		}

		ler.close();

	}

}
