package unidade4;

import java.util.Scanner;

public class Uni4Exe16 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a idade da primeira mulher: ");
		int idMulher1 = ler.nextInt();
		System.out.print("Digite a idade da segunda mulher: ");
		int idMulher2 = ler.nextInt();
		System.out.print("Digite a idade do primeiro homem: ");
		int idHomem1 = ler.nextInt();
		System.out.print("Digite a idade do segundo homem: ");
		int idHomem2 = ler.nextInt();

		int soma, produto;

		if (idMulher1 > idMulher2) {
			if (idHomem1 > idHomem2) {
				soma = idHomem1 + idMulher2;
				produto = idHomem2 * idMulher1;
			} else {
				soma = idHomem2 + idMulher2;
				produto = idHomem1 * idMulher1;
			}
		} else {
			if (idHomem1 > idHomem2) {
				soma = idHomem1 + idMulher1;
				produto = idHomem2 * idMulher2;
			} else {
				soma = idHomem2 + idMulher1;
				produto = idHomem1 * idMulher2;
			}
		}

		System.out.printf("A soma do mais velho com a mais nova, e o produto do mais novo com a mais velha equivalem respectivamente %s e %s", soma, produto);

		ler.close();
	}

}
