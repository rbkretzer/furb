package unidade4;

import java.util.Scanner;

public class Uni4Exe14 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = ler.nextInt();
		System.out.print("Digite o mês: ");
		int mes = ler.nextInt();
		System.out.print("Digite o dia: ");
		int dia = ler.nextInt();

		boolean ehValida = true;
		boolean ehBissexto = false;

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			ehBissexto = true;
		}

		if (mes < 1 && mes > 12) {
			ehValida = false;
		} else if (dia < 1 || dia > 31 && mes % 2 != 0 || mes == 8) {
			ehValida = false;
		} else if (mes != 2 && dia > 30) {
			ehValida = false;
		} else if (ehBissexto && dia > 29) {
			ehValida = false;
		} else if (!ehBissexto && dia > 28) {
			ehValida = false;
		}

		if (ehValida) {
			System.out.println("Data válida.");
		} else {
			System.out.println("Data inválida.");
		}

		ler.close();
	}

}
