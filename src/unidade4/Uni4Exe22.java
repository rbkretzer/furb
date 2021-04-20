package unidade4;

import java.util.Scanner;

public class Uni4Exe22 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("--------Digite a opção que corresponde ao seu curso--------\n" + "1 - Ciência da Computação\n"
				+ "2 - Licenciatura da Computação\n" + "3 - Sistemas de Informação\n" + "Opção: ");
		int curso = ler.nextInt();

		switch (curso) {
		case 1:
			System.out.println("Bacharel em Ciência da Computação");
			break;
		case 2:
			System.out.println("Licenciado em Computação");
			break;
		case 3:
			System.out.println("Bacharel em Sistemas de Informação");
			break;
		default:
			System.out.println("Curso inválido");
		}

		ler.close();

	}

}
