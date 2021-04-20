package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1021 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		
		double valor = ler.nextDouble();
		
		System.out.println("NOTAS:");
		double cem = (valor - (valor % 100)) / 100;
		System.out.println(df.format(cem) + " nota(s) de R$ 100.00");
		
		double cinquenta = ((valor % 100) - (valor % 50)) /50;
		System.out.println(df.format(cinquenta) + " nota(s) de R$ 50.00");
		
		double vinte = ((valor % 50) - ((valor % 50) % 20)) / 20;
		System.out.println(df.format(vinte) + " nota(s) de R$ 20.00");
		
		double dez = (((valor % 50) % 20) - (valor % 10)) / 10;
		System.out.println(df.format(dez) + " nota(s) de R$ 10.00");
		
		double cinco = ((valor % 10) - (valor % 5)) / 5;
		System.out.println(df.format(cinco) + " nota(s) de R$ 5.00");
		
		double dois = ((valor % 5) - ((valor % 5) % 2)) / 2;
		System.out.println(df.format(dois) + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		double um = (((valor % 5) % 2) - (valor % 1)) / 1;
		System.out.println(df.format(um) + " moeda(s) de R$ 1.00");
		
		double cent50 = ((valor % 1) - (valor % 0.50)) / 0.50;
		System.out.println(df.format(cent50) + " moeda(s) de R$ 0.50");
		
		double cent25 = ((valor % 0.50) - ((valor % 0.50) % 0.25)) / 0.25;
		System.out.println(df.format(cent25) + " moeda(s) de R$ 0.25");
		
		double cent10 = (((valor % 0.50) % 0.25) - (((valor % 0.50) % 0.25) % 0.10)) / 0.10;
		System.out.println(df.format(cent10) + " moeda(s) de R$ 0.10");
		
		double cent5 = ((((valor % 0.50) % 0.25) % 0.10) - ((((valor % 0.50) % 0.25) % 0.10) % 0.05)) / 0.05;
		System.out.println(df.format(cent5) + " moeda(s) de R$ 0.05");
		
		double cent1 = (((((valor % 0.50) % 0.25) % 0.10) % 0.05) % 0.05) / 0.01;
		System.out.println(df.format(cent1) + " moeda(s) de R$ 0.01");
		
		ler.close();
	}

}
