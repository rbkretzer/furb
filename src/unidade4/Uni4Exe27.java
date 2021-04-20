package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe27 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("-------------------------Digite o horário de entrada-------------------------");
		System.out.print("Horas: ");
		int hEntrada = ler.nextInt();
		System.out.print("Minutos: ");
		int minEntrada = ler.nextInt();
		System.out.println("--------------------------Digite o horário de saída--------------------------");
		System.out.print("Horas: ");
		int hSaida = ler.nextInt();
		System.out.print("Minutos: ");
		int minSaida = ler.nextInt();

		int hTotal, minTotal;

		if (hEntrada > hSaida) {
			hTotal = 24 + hSaida - hEntrada;
		} else {
			hTotal = hSaida - hEntrada;
		}
		if (minEntrada > minSaida) {
			minTotal = 60 + minSaida - minEntrada;
			hTotal--;
		} else {
			minTotal = minSaida - minEntrada;
		}

		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Tempo de permanência no estacionamento: " + hTotal + "h : " + minTotal + "min");

		double precoMin = 5.0;
		double preco = 0;
		switch (hTotal) {
		case 0:
			System.out.println("Total: R$ " + df.format(precoMin));
			break;
		case 1:
		case 2:
			if (minTotal >= 30) {
				preco = (precoMin * hTotal) + 7.5;
			} else {
				preco = precoMin * hTotal;
			}
			break;
		case 3:
		case 4:
			int horasSegundoValor = hTotal - 2;
			if (minTotal >= 30) {
				preco = (precoMin * 2) + (7.5 * horasSegundoValor) + 10;
			} else {
				preco = (precoMin * 2) + (7.5 * horasSegundoValor);
			}
			break;
		default:
			int horasTerceiroValor = hTotal - 4;
			if (minTotal >= 30) {
				preco = (5 * 2) + (7.5 * 2) + (10 * horasTerceiroValor) + 10;
			} else {
				preco = (5 * 2) + (7.5 * 2) + (10 * horasTerceiroValor);
			}
		}
		System.out.println("Total: R$ " + df.format(preco));

		ler.close();

	}
}