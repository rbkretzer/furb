package unidade4;

import java.util.Scanner;

public class Uni4Exe23 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o m�s desejado: ");
		int mes = ler.nextInt();

		String mesExtenso;

		switch (mes) {
		case 1:
			mesExtenso = "Janeiro";
			break;
		case 2:
			mesExtenso = "Fevereiro";
			break;
		case 3:
			mesExtenso = "Mar�o";
			break;
		case 4:
			mesExtenso = "Abril";
			break;
		case 5:
			mesExtenso = "Maio";
			break;
		case 6:
			mesExtenso = "Junho";
			break;
		case 7:
			mesExtenso = "Julho";
			break;
		case 8:
			mesExtenso = "Agosto";
			break;
		case 9:
			mesExtenso = "Setembro";
			break;
		case 10:
			mesExtenso = "Outubro";
			break;
		case 11:
			mesExtenso = "Novembro";
			break;
		case 12:
			mesExtenso = "Dezembro";
			break;
		default:
			mesExtenso = "Valor inv�lido";
		}

		System.out.println(mesExtenso);

		ler.close();
	}

}
