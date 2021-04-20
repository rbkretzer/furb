package unidade4;

import java.util.Scanner;

public class Uni4Exe19 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de x: ");
		int x = ler.nextInt();
		System.out.println("Digite o valor de y: ");
		int y = ler.nextInt();
		
		int quadrante;
		
		if(x == 0 && y == 0) {
			quadrante = 0;
		} else {
			if (x >= 0) {
				if(y >= 0) {
					quadrante = 1;
				} else {
					quadrante = 2;
				}
			} else {
				if(y <= 0) {
					quadrante = 3;
				} else {
					quadrante = 4;
				}
			}
		}
		
		System.out.println("O ponto está localizado no quadrante " + quadrante);
		
		ler.close();
	}

}
