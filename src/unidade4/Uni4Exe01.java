package unidade4;

import java.util.Scanner;

public class Uni4Exe01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double horasTrabalhadas = ler.nextDouble();
		double valorHora = ler.nextDouble();
		double salarioMes = valorHora * horasTrabalhadas;
		if (horasTrabalhadas > 160) {
			double salarioExtra = (horasTrabalhadas - 160) * (valorHora / 2);
			salarioMes += salarioExtra;
		}
		System.out.println("Salário total: " + salarioMes);
		ler.close();

	}

}
