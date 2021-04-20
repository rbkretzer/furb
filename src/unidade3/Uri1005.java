package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1005 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat dfMedia = new DecimalFormat("0.00000");
		
		double a = ler.nextDouble();
		double b = ler.nextDouble();
		
		double media = ((a * 3.5) + (b * 7.5)) / 11;
		
		System.out.println("MEDIA = " + dfMedia.format(media));
		ler.close();
	}
}
