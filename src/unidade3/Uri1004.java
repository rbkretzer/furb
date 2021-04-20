package unidade3;

import java.util.Scanner;

public class Uri1004 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a = ler.nextInt();
		int b = ler.nextInt();
		
		int prod = a * b;
		
		System.out.println("PROD = " + prod);
		ler.close();
	}
}
