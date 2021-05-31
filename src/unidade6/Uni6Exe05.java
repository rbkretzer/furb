package unidade6;

import java.util.Scanner;

public class Uni6Exe05 {

	Scanner ler;

	public Uni6Exe05() {
		ler = new Scanner(System.in);
		String[] respostasR = new String[5];
		String[] respostasM = new String[5];
		System.out.println("Para as seguintes perguntas escereva SIM, N�O ou IND (indiferente) para o rapaz e para a mo�a:\n"
						+ "1 � pergunta - Gosta de m�sica sertaneja?\n2 � pergunta - Gosta de futebol?\n" + "3 � pergunta - Gosta de seriados?\n"
						+ "4 � pergunta - Gosta de redes sociais?\n" + "5 � pergunta - Gosta da Oktoberfest?");

		lerRespostas(respostasR, respostasM);
		int valorAfinidade = calculaAfinidade(respostasR, respostasM);
		escreveMensagem(valorAfinidade);
		ler.close();
	}

	public void lerRespostas(String[] respostasR, String[] respostasM) {
		for (int i = 0; i < respostasR.length; i++) {
			System.out.print("Digite a " + (i + 1) + "� resposta do rapaz: ");
			respostasR[i] = ler.next().trim().toUpperCase();
			System.out.print("Digite a " + (i + 1) + "� resposta da mo�a: ");
			respostasM[i] = ler.next().trim().toUpperCase();
		}
	}

	public int calculaAfinidade(String[] respostaR, String[] respostasM) {
		int valorAfinidade = 0;
		for (int i = 0; i < respostasM.length; i++) {
			if (respostaR[i].equals(respostasM[i])) {
				valorAfinidade += 3;
			} else if (respostaR[i].equals("IND")) {
				valorAfinidade += 1;
			} else {
				valorAfinidade -= 2;
			}
		}
		return valorAfinidade;
	}

	public void escreveMensagem(int valorAfinidade) {
		String mensagem = "";
		if (valorAfinidade == 15) {
			mensagem = "Casem!";
		} else if (valorAfinidade >=10 && valorAfinidade <= 14) {
			mensagem = "Voc�s t�m muita coisa em comum!";
		} else if (valorAfinidade >= 5 && valorAfinidade <= 9) {
			mensagem = "Talvez n�o d� certo :(";
		} else if (valorAfinidade >=0 && valorAfinidade <= 4) {
			mensagem = "Vale um encontro.";
		} else if (valorAfinidade >= -9 && valorAfinidade <= -1) {
			mensagem = "Melhor n�o perder tempo";
		} else {
			mensagem = "Voc�s se odeiam!";
		}
		System.out.println(mensagem);
	}

	public static void main(String[] args) {

		new Uni6Exe05();

	}

}
