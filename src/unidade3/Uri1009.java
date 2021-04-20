package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1009 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat dfTotal = new DecimalFormat("0.00");
		
		String nome = ler.next();
		double salario = ler.nextDouble();
		double vendas = ler.nextDouble();
		
		double comissao = vendas * 0.15;
		double total = salario + comissao;
		
		System.out.println("TOTAL = R$ " + dfTotal.format(total));
		ler.close();
	}
}
