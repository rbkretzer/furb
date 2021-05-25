package unidade5;

public class Uni5Exe22 {

	public static void main(String[] args) {

		double aumentoAtual = 1.5;
		double salario = 2000;
		int ano = 1996;

		double salarioAtual = salario + (salario * (aumentoAtual / 100));
		ano++;

		while (ano <= 2021) {
			aumentoAtual *= 2;
			salarioAtual = salario + (salario * (aumentoAtual / 100.0));
			ano++;
		}

		System.out.print(salarioAtual);

	}

}
