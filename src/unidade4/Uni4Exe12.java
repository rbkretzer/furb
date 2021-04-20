package unidade4;

import java.util.Scanner;

public class Uni4Exe12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("--------Para formar um tri�ngulo digite os valores de seus lados--------");
		System.out.print("Lado 1: ");
		double lado1 = ler.nextDouble();
		System.out.print("Lado 2: ");
		double lado2 = ler.nextDouble();
		System.out.print("Lado 3: ");
		double lado3 = ler.nextDouble();

		System.out.println("-------------------------------Resultado-------------------------------");
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Tri�ngulo equil�tero");
			} else {
				if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("Tri�ngulo is�sceles.");
				} else {
					System.out.println("Tri�ngulo escaleno");
				}
			}
		} else {
			System.out.println("Lados informados n�o formam um tri�ngulo.");
		}

		ler.close();

	}

}
