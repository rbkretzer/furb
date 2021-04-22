package unidade4;

import java.util.Scanner;

public class Uni4Exe20 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("--------Digite os valores das notas--------");
		System.out.print("Nota prova 1: ");
		double nota1 = ler.nextDouble();
		System.out.print("Nota prova 2: ");
		double nota2 = ler.nextDouble();
		System.out.print("Nota prova 3: ");
		double nota3 = ler.nextDouble();
		System.out.print("Média dos exercícios: ");
		double notaExer = ler.nextDouble();

		double media = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExer) / 7;
		char conceito;

		if (media >= 9) {
			conceito = 'A';
		} else if (media >= 7.5) {
			conceito = 'B';
		} else if (media >= 6) {
			conceito = 'C';
		} else if (media >= 4) {
			conceito = 'D';
		} else {
			conceito = 'E';
		}
		
		switch (conceito) {
		case 'C':
		case 'D':
			System.out.println("Aluno(a) reprovado(a)");
			break;
		default:
			System.out.println("Aluno(a) reprovado(a)");
		}

		ler.close();
	}

}
