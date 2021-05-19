package unidade5;

import java.util.Scanner;

public class Uni5Exe15 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o nome do aluno: ");
		String nome = ler.next();

		double nota1 = 0;
		double nota2 = 1;

		while (!nome.equalsIgnoreCase("fim")) {
			System.out.print("1ª nota: ");
			nota1 = ler.nextDouble();
			System.out.print("2ª nota: ");
			nota2 = ler.nextDouble();
			System.out.println("Média: " + (nota1 + nota2) / 2);
			System.out.print("Digite o nome do aluno: ");
			nome = ler.next();
		}

		ler.close();

	}

}
