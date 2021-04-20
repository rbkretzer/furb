package unidade3;

import java.util.Scanner;

public class Uri1007 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		int d = ler.nextInt();
		
		System.out.println("DIFERENCA = " + ((a * b) - (c * d)));
		ler.close();
	}
}
