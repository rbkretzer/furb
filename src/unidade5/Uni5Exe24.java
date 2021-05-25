package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe24 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");

		System.out.print("Digite o limite diário do peso da pesca: ");
		double limite = ler.nextDouble();
		double pesoTotalPesca = 0;
		boolean continua = true;
		char resposta = '0';
		while (continua) {
			System.out.print("Digite o peso do peixe: ");
			pesoTotalPesca += ler.nextDouble();
			if (pesoTotalPesca <= limite) {
				System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
				resposta = ler.next().trim().toLowerCase().charAt(0);
				if (resposta == 's') {
					continua = true;
				} else {
					continua = false;
				}
			} else {
				System.out.println("Peso total da pesca do dia excedeu o limite do dia!!!");
				continua = false;
			}
		}

		System.out.println("Peso total pescado durante o dia: " + df.format(pesoTotalPesca));

		ler.close();

	}

}
