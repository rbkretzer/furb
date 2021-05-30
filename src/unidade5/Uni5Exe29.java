package unidade5;

import java.util.Scanner;

public class Uni5Exe29 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o valor de saque: ");
		int valor = ler.nextInt();

		while (valor < 0) {
			System.out.println("Valor inválido.");
			System.out.print("Digite o valor de saque: ");
			valor = ler.nextInt();
		}

		float valorComDecimal = Float.parseFloat(String.valueOf(valor));
		double resto = 0;
		String restoTexto = "0";

		double cedulas20 = valorComDecimal / 20.0;
		String restoTexto0 = String.valueOf(cedulas20);
		int inteiroCedulas20 = Integer.parseInt(restoTexto0.substring(0, restoTexto0.indexOf(".")));

		resto = valorComDecimal - (inteiroCedulas20 * 20.0);
		restoTexto = String.valueOf(resto);
		int inteiroCedulas10 = Integer.parseInt(restoTexto.substring(0, restoTexto.indexOf("."))) / 10;

		resto -= (inteiroCedulas10 * 10.0);
		restoTexto = String.valueOf(resto);
		int inteiroCedulas5 = Integer.parseInt(restoTexto.substring(0, restoTexto.indexOf("."))) / 5;

		resto -= (inteiroCedulas5 * 5.0);
		restoTexto = String.valueOf(resto);
		int inteiroCedulas2 = Integer.parseInt(restoTexto.substring(0, restoTexto.indexOf("."))) / 2;

		resto -= (inteiroCedulas2 * 2.0);
		restoTexto = String.valueOf(resto);
		int inteiroCedulas1 = Integer.parseInt(restoTexto.substring(0, restoTexto.indexOf("."))) / 1;

		System.out.println("Cédulas de 20: " + inteiroCedulas20 + "\nCédulas de 10: " + inteiroCedulas10
				+ "\nCédulas de 5: " + inteiroCedulas5 + "\nCédulas de 2: " + inteiroCedulas2 + "\nCédulas de 1: "
				+ inteiroCedulas1);

		ler.close();

	}

}
