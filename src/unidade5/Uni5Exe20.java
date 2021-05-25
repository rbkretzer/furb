package unidade5;

import java.util.Scanner;

public class Uni5Exe20 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a massa do material radioativo: ");
		double massa = ler.nextDouble();

		double massaGramas = (massa * 1000.0);
		int tempoTotalSegundos = 0;

		while (massaGramas >= 0.5) {
			massaGramas /= 2;
			tempoTotalSegundos += 50;
		}

		double tempoTotal = (tempoTotalSegundos / 3600.0);

		String tempoTotalTexto = String.valueOf(tempoTotal);
		int posicaoPonto = tempoTotalTexto.indexOf(".");
		String horasTexto = tempoTotalTexto.substring(0, posicaoPonto);
		int horas = Integer.parseInt(horasTexto);

		double minComSeg = (tempoTotal - horas) * 60.0;
		String minComSegTexto = String.valueOf(minComSeg);
		int posicaoPontoMin = minComSegTexto.indexOf(".");
		String minTexto = minComSegTexto.substring(0, posicaoPontoMin);
		int min = Integer.parseInt(minTexto);

		double segComDecimais = (minComSeg - min) * 60.0;
		String segComDecimaisTexto = String.valueOf(segComDecimais);
		int posicaoPontoSeg = segComDecimaisTexto.indexOf(".");
		String segTexto = segComDecimaisTexto.substring(0, posicaoPontoSeg);
		int segundos = Integer.parseInt(segTexto);

		System.out.println("A mass inicial de " + massa + "Kg, levou " + horas + "h " + min + "min " + segundos
				+ "s para chegar a " + massaGramas + "g.");

		ler.close();

	}

}
