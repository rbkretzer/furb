package unidade3;

import java.util.Scanner;

public class Uri1016 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int distancia = ler.nextInt();
		
		int tempoPara = distancia * 2;
		
		System.out.println(tempoPara + " minutos");
		ler.close();
	}
}
