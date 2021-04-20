package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1002 {
	
	public static void main(String[] args) {
		
		Scanner  ler = new Scanner(System.in);
		DecimalFormat dcf = new DecimalFormat("0.0000");
		
		double raio = ler.nextFloat();
		/*
		double area = 3.14159 * Math.pow(raio, 2);
		
		System.out.println("A=" + dcf.format(area));
		*/
		System.out.println("A=" + dcf.format((3.14159 * Math.pow(raio, 2))));
		ler.close();
	}
}
