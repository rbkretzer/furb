package unidade4;

import java.util.Scanner;

public class Uni4Exe22 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("--------Digite a op��o que corresponde ao seu curso--------\n" + "1 - Ci�ncia da Computa��o\n"
				+ "2 - Licenciatura da Computa��o\n" + "3 - Sistemas de Informa��o\n" + "Op��o: ");
		int curso = ler.nextInt();

		switch (curso) {
		case 1:
			System.out.println("Bacharel em Ci�ncia da Computa��o");
			break;
		case 2:
			System.out.println("Licenciado em Computa��o");
			break;
		case 3:
			System.out.println("Bacharel em Sistemas de Informa��o");
			break;
		default:
			System.out.println("Curso inv�lido");
		}

		ler.close();

	}

}
