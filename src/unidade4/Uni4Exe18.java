package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o dia de vencimento da presta��o:");
		int diaVen = ler.nextInt();
		System.out.print("Digite o dia do pagamento da presta��o: ");
		int diaPag = ler.nextInt();
		System.out.print("Digite o valor das presta��es: ");
		double valor = ler.nextDouble();

		double valorTotal;

		if (diaPag <= diaVen) {
			valorTotal = valor - (valor * 0.1);
		} else if (diaPag <= diaVen + 5) {
			valorTotal = valor;
		} else {
			valorTotal = valor + (valor * (0.02 * (diaPag - diaVen)));
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Valor de Pgto.: R$ " + df.format(valorTotal));

		ler.close();

	}

}
