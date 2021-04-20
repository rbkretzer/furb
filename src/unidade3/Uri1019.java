package unidade3;

import java.util.Scanner;

public class Uri1019 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n = ler.nextInt();
		
		int segundos = n % 60;
		int minutos = n / 60;
		int horas = minutos / 60;
		minutos %= 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		ler.close();
	}
}
