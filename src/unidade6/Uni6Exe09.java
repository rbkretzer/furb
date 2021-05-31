package unidade6;

import java.util.Scanner;

public class Uni6Exe09 {

	private Scanner ler;

	public Uni6Exe09() {
		ler = new Scanner(System.in);
		int pessoasOuvidas = 30;
		int[] sexo = new int[pessoasOuvidas];
		float[] nota = new float[pessoasOuvidas];
		int[] idade = new int[pessoasOuvidas];

		inserirDados(sexo, nota, idade);
		float notaMedia = calcularMediaNota(nota);

		calcularMediaHomens(nota, sexo);
		buscarNotaMulherMaisJovem(nota, idade, sexo);
		calcularMulheres50AnosNotaAcimaMedia(notaMedia, nota, sexo, idade);

	}

	public void inserirDados(int[] sexo, float[] nota, int[] idade) {
		for (int cont = 0; cont < sexo.length; cont++) {
			System.out.print("Digite seu sexo (1 = feminino 2 = masculino): ");
			sexo[cont] = ler.nextInt();
			System.out.print("Digite sua nota (0 até 10): ");
			nota[cont] = ler.nextFloat();
			System.out.print("Digite sua idade: ");
			idade[cont] = ler.nextInt();
		}
	}

	public float calcularMediaNota(float[] nota) {
		float soma = 0;
		for (int posicao = 0; posicao < nota.length; posicao++) {
			soma += nota[posicao];
		}
		float media = soma / nota.length;

		System.out.println("A média geral das notas para o cinema foi de: " + media);

		return media;
	}

	public void calcularMediaHomens(float[] nota, int[] sexo) {
		float soma = 0;
		int numHomens = 0;
		for (int posicao = 0; posicao < nota.length; posicao++) {
			if (sexo[posicao] == 2) {
				soma += nota[posicao];
				numHomens++;
			}
		}
		float mediaHomens = soma / numHomens;

		System.out.println("A média de notas dada ao cinema pelos homens foi de: " + mediaHomens);
	}

	public void buscarNotaMulherMaisJovem(float[] nota, int[] idade, int[] sexo) {
		int posicaoMulherMaisJovem = 0;
		float idadeMulher = 0;

		for (int posicao = 0; posicao < nota.length; posicao++) {
			if (sexo[posicao] == 1) {
				if (idadeMulher == 0) {
					posicaoMulherMaisJovem = posicao;
				} else {
					if (idade[posicao] < idadeMulher) {
						posicaoMulherMaisJovem = posicao;
					}
				}
			}
		}
		float notaMulherJovem = nota[posicaoMulherMaisJovem];

		System.out.println("A mulher mais jovem deu a nota: " + notaMulherJovem);
	}

	public void calcularMulheres50AnosNotaAcimaMedia(float notaMedia, float[] nota, int[] sexo, int[] idade) {
		int mulheresAcima50NotaAcimaMedia = 0;

		for (int posicao = 0; posicao < nota.length; posicao++) {
			if (sexo[posicao] == 1) {
				if (idade[posicao] > 50 && nota[posicao] > notaMedia) {
					mulheresAcima50NotaAcimaMedia++;
				}
			}
		}
		System.out.println(
				mulheresAcima50NotaAcimaMedia + " mulheres com mais de 50 anos deram uma nota acima da média.");
	}

	public static void main(String[] args) {
		new Uni6Exe09();
	}
}
