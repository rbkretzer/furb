package unidade3;

import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int valor = ler.nextInt();
		
		int cem = valor / 100;
		System.out.println(cem + "nota()");
		valor %= 100;
		
		int cinquenta = valor / 50;
		System.out.println(cinquenta);
		valor %= 50;
		
		int vinte = valor / 20;
		System.out.println(vinte);
		valor %= 20;
		
		int dez = valor / 10;
		System.out.println(dez);
		valor %= 10;
		
		int cinco = valor / 5;
		System.out.println(cinco);
		valor %= 5;

		int dois = valor / 2;
		System.out.println(dois);
		valor %= 2;

		int um = valor / 1;
		System.out.println(um);
		
		ler.close();
	}

}
