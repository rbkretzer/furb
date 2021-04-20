package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1010 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat dfTotal = new DecimalFormat("0.00");
		
		int cod1 = ler.nextInt();
		int quant1 = ler.nextInt();
		double val1 = ler.nextDouble();
		
		int cod2 = ler.nextInt();
		int quant2 = ler.nextInt();
		double val2 = ler.nextDouble();
		
		double total = (quant1 * val1) + (quant2 * val2);
		
		System.out.println("VALOR A PAGAR: R$ " + dfTotal.format(total));
		ler.close();
	}
}
