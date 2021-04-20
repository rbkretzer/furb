package unidade4;

import java.util.Scanner;

public class Uni4Exe04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		float valor = ler.nextFloat();

		String valorTexto = String.valueOf(valor);

		int posicaoPonto = valorTexto.indexOf(".");

		String parteDecimal = valorTexto.substring(posicaoPonto, valorTexto.length());

		if (parteDecimal.equals(".0")) {
			System.out.println("Não foram digitadas casas decimais.");
		} else {
			System.out.println("Foram digitadas casas decimais.");
		}
		ler.close();

	}

}
