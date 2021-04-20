package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1012 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000"); 
		
		double a = ler.nextDouble();
		double b = ler. nextDouble();
		double c = ler.nextDouble();
		
		double aTri = (a * c) / 2;
		double aCir = 3.1415 * Math.pow(c, 2);
		double aTra = ((a + b) * c) / 2;
		double aQua = Math.pow(b, 2);
		double aRet = a * b;
		
		System.out.println("TRIANGULO: " + df.format(aTri) + "\nCIRCULO: " + df.format(aCir)+ "\nTRAPEZIO: " + df.format(aTra) + "\nQUADRADO: " + df.format(aQua) + "\nRETANGULO: " + df.format(aRet));
		ler.close();
	} 
}
