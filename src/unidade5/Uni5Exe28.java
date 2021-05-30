package unidade5;

import java.util.Scanner;

public class Uni5Exe28 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		char continua = '0';
		int codigo = 0;
		int votosNenhumDeNos = 0;
		int votosCPM22 = 0;
		int votosSkank = 0;
		int votosJotaQuest = 0;
		int total = 0;
		String vencedor = "";

		while (continua == 's') {
			System.out.print("Digite um dos seguintes números para selecionar a banda:\n 1 - Nenhum de Nós\n"
					+ "2 - CPM22\n" + "3 - Skank\n" + "4 - Jota Quest");
			codigo = ler.nextInt();

			switch (codigo) {
			case 1:
				votosNenhumDeNos++;
				total++;
				break;
			case 2:
				votosCPM22++;
				total++;
				break;
			case 3:
				votosSkank++;
				total++;
				break;
			case 4:
				votosJotaQuest++;
				total++;
				break;
			default:
				System.out.print("Código inválido.");

			}

			System.out.print("Mais um voto: s (SIM) / n (NÃO)?");
			continua = ler.next().trim().toLowerCase().charAt(0);
		}

		if (votosNenhumDeNos > votosCPM22 && votosNenhumDeNos > votosSkank && votosNenhumDeNos > votosJotaQuest) {
			vencedor = "Nenhum de nós";
		} else if (votosCPM22 > votosSkank && votosCPM22 > votosJotaQuest) {
			vencedor = "CPM22";
		} else if (votosSkank > votosJotaQuest) {
			vencedor = "Skank";
		} else {
			vencedor = "Jota Quest";
		}

		System.out.println("Total Nenhum de Nós: " + votosNenhumDeNos + "\nTotal CPM22: " + votosCPM22
				+ "\nTotal Skank: " + votosSkank + "\nTotal Jota Quest: " + votosJotaQuest
				+ "\nPercentual Nenhum de Nós: " + ((votosNenhumDeNos / total) * 100)
				+ "\nPercentual CPM22: " + ((votosCPM22 / total) * 100)
				+ "\nPercentual Skank: " + ((votosSkank / total) * 100)
				+ "\nPercentual Jota Quest: " + ((votosJotaQuest / total) * 100)
				+ "\nA banda vencedora foi: " + vencedor);

		ler.close();

	}

}
