package unidade4;

import java.util.Scanner;

public class Uni4Exe21 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a massa do paciente: ");
		double massa = ler.nextDouble();
		System.out.print("Digite a altura do paciente: ");
		double altura = ler.nextDouble();

		double imc = massa / Math.pow(altura, 2);

		String classificacao;

		if (imc >= 40) {
			classificacao = "Obesidade Grau III";
		} else if (imc >= 35) {
			classificacao = "Obesidade Grau II";
		} else if (imc >= 30) {
			classificacao = "Obesidade Grau I";
		} else if (imc >= 25) {
			classificacao = "Sobrepeso";
		} else if (imc > 18.5) {
			classificacao = "Sudável";
		} else {
			classificacao = "Magreza";
		}

		System.out.println("O IMC do paciente é " + classificacao);

		ler.close();

	}

}
