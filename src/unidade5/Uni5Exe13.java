package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe13 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		
		System.out.print("Digite quantos L o tanque suporta de combustível: ");
		double qtdCombustivel = ler.nextDouble();
		
		System.out.print("Digite a quantidade de paradas (considere o local destino): ");
		int paradas = ler.nextInt();
		
		int odometro = 0;
		double quilomet = 0;
		double somaQuilomet = 0;
		double qtdCombustivelAtual = 0;
		double qtdCombustivelAbastecida = 0;
		
		for(int i = 1; i <= paradas; i++) {
			System.out.print("Digite o valor do odômetro na " + i + "ª parada: ");
			odometro = ler.nextInt();
			System.out.print("Digite a quantidade atual do combustível: ");
			qtdCombustivelAtual = ler.nextDouble();
			System.out.print("Digite o valor a ser abastecido: ");
			qtdCombustivelAbastecida = ler.nextDouble();
			quilomet = odometro / (qtdCombustivel - qtdCombustivelAtual);
			System.out.println("A quilometragem até a " + i + "ª parada foi de " + df.format(quilomet) + " Km/L");
			somaQuilomet += quilomet;
			qtdCombustivel = qtdCombustivelAtual + qtdCombustivelAbastecida;
		}
		System.out.println("A quilometragem média obtida em toda a viagem foi de " + df.format((somaQuilomet / paradas)) + " Km/L");
		
		ler.close();
		

	}

}
