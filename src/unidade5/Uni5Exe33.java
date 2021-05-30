package unidade5;

import java.util.Scanner;

public class Uni5Exe33 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int voto = 0;
		int voto1 = 0;
		int voto2 = 0;
		int voto3 = 0;
		int voto4 = 0;
		int votoNulo = 0;
		int votoBranco = 0;

		do {
			System.out.print("Digite uma das seguintes opções:\n1 a 4- Voto para o respectivo candidato\n"
					+ "5 - Voto nulo\n" + "6 - Voto em branco\n 0 - Sair");
			voto = ler.nextInt();

			switch (voto) {
			case 1:
				voto1++;
				break;
			case 2:
				voto2++;
				break;
			case 3:
				voto3++;
				break;
			case 4:
				voto4++;
				break;
			case 5:
				votoNulo++;
				break;
			case 6:
				votoBranco++;
				break;
			case 0:
				break;
			default:
				System.out.print("Opção incorreta.");
			}
		} while (voto != 0);

		int total = voto1 + voto2 + voto3 + voto4 + votoNulo + votoBranco;
		double percentualBranco = (votoBranco * 100.0) / total;
		double percentualNulo = (votoNulo * 100.0) / total;

		System.out.println("Total para candidato 1: " + voto1 + "\nTotal para candidato 2: " + voto2
				+ "\nTotal para candidato 3: " + voto3 + "\nTotal para candidato 4: " + voto4
				+ "Total para candidato 1: " + voto1 + "\nTotal de votos nulos: " + votoNulo
				+ "\nTotal de votos em branco: " + votoBranco + "\nPercentual de votos em branco: " + percentualBranco
				+ "%\nPercentual de votos nulos: " + percentualNulo + "%");


		ler.close();
	}

}
