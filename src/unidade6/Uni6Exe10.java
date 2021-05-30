package unidade6;

import java.util.Scanner;

public class Uni6Exe10 {

	Scanner ler;

	public Uni6Exe10() {
		ler = new Scanner(System.in);
		int[] vetor = new int[50];
		int opcao = 0;
		int total = 0;
		do {
			System.out.print(
					"Digite uma das seguintes opções:\n1 – Incluir valor\n2 – Pesquisar valor\n3 – Alterar valor\n4 – Excluir valor\n5 – Mostrar valores\n6 – Ordenar valores\n7 – Sair do sistema\nOpção: ");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				if (inserir(vetor, total)) {
					System.out.println("Valor inserido.");
					total++;
				} else {
					System.out.print("Vetor está cheio.");
				}
				break;
			case 2:
				pesquisar(vetor, total);
				break;
			case 3:
				alterar(vetor, total);
				break;
			case 4:
				total = excluir(vetor, total);
				break;
			case 5:
				mostrar(vetor, total);
				break;
			case 6:
				ordenar(vetor, total);
				break;
			case 7:
				System.out.print("Saindo...");
				break;
			default:
				System.out.print("Opcação inválida.");
			}

		} while (opcao != 7);
	}

	public boolean inserir(int[] vetor, int total) {
		System.out.print("Digite um valor para incluir no vetor: ");
		int numero = ler.nextInt();
		if (vetor[total] < 50) {
			vetor[total] = numero;
			return true;
		}
		return false;
	}

	public int pesquisar(int[] vetor, int total) {
		System.out.print("Digite um valor para pesquisar: ");
		int valor = ler.nextInt();

		for (int i = 0; i < total; i++) {
			if (vetor[i] == valor) {
				System.out.println("Valor encontrado na poscição " + i + ".");
				return i;
			}
		}
		System.out.println("Valor não encontrado no vetor.");
		return -1;
	}

	public void mostrar(int[] vetor, int total) {
		for (int i = 0; i < total; i++) {
			System.out.println(vetor[i]);
		}
	}

	public void alterar(int[] vetor, int total) {
		int indice = pesquisar(vetor, total);
		if (indice != -1) {
			System.out.print("Digite o novo valor para essa posição: ");
			int valor = ler.nextInt();
			vetor[indice] = valor;
			System.out.print("O valor foi alterado.");
		}
	}

	public int excluir(int[] vetor, int total) {
		int indice = pesquisar(vetor, total);
		if (indice != -1) {
			for (int i = indice; i < total; i++) {
				vetor[i] = vetor[1 + 1];
			}
			total--;
			System.out.print("Número excluído com sucesso");
		}
		return total;
	}

	public void ordenar(int[] vetor, int total) {
		int valorAntesTroca = 0;
		for (int i = 0; i < total; i++) {
			int posicao = (i + 1);
			for (int x = posicao; x <= (total - 1); x++) {
				if (vetor[i] > vetor[posicao]) {
					valorAntesTroca = vetor[i];
					vetor[i] = vetor[posicao];
					vetor[posicao] = valorAntesTroca;
				} 
				posicao++;
			}
		}
	}

	public static void main(String[] args) {

		new Uni6Exe10();

	}

}
