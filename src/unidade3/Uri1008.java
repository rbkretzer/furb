package unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1008 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		DecimalFormat dfSalario = new DecimalFormat("0.00");
		
		int func = ler.nextInt();
		int horasTrab = ler.nextInt();
		double valorHora = ler.nextDouble();
		
		double salario = horasTrab * valorHora;
		
		System.out.println("NUMBER = " + func + "\nSALARY = U$ " + dfSalario.format(salario));
		ler.close();
	}
}
