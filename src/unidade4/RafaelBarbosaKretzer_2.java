package unidade4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RafaelBarbosaKretzer_2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite as três notas:");
		double nota1 = ler.nextDouble();
		double nota2 = ler.nextDouble();
		double nota3 = ler.nextDouble();

		double notaBaixa;
		double notaMedia;
		double notaAlta;

		if (nota1 > nota2 && nota1 > nota3) {
			notaAlta = nota1;
		} else if (nota2 > nota1 && nota2 > nota3) {
			notaAlta = nota2;
		} else {
			notaAlta = nota3;
		}
		if (nota1 < nota2 && nota1 < nota3) {
			notaBaixa = nota1;
		} else if (nota2 < nota1 && nota2 < nota3) {
			notaBaixa = nota2;
		} else {
			notaBaixa = nota3;
		}
		if (notaAlta != nota1 && notaBaixa != nota1) {
			notaMedia = nota1;
		} else if (notaAlta != nota2 && notaBaixa != nota2) {
			notaMedia = nota2;
		} else {
			notaMedia = nota3;
		}

		notaBaixa += 0.1;
		notaMedia += 0.2;
		notaAlta += 0.3;

		System.out.println("_Menu:\n" + "a)  média simples\n" + "b) média ponderada");
		String opcao = ler.next();
		char opcaoChar = opcao.toUpperCase().trim().charAt(0);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		switch (opcaoChar) {
		case 'A':
			double mediaSimples = (notaBaixa + notaMedia + notaAlta) / 3;
			System.out.println("O valor da média simples do aluno: " + df.format(mediaSimples));
			break;
		case 'B':
			double mediaPonderada = (notaBaixa * 0.7) + (notaMedia * 0.1) + (notaAlta * 0.2);
			System.out.println("O valor da média ponderarada do aluno: " + df.format(mediaPonderada));
			break;
		default:
			System.out.println("Valor inválido do Menu");
		}

		ler.close();

	}

}
