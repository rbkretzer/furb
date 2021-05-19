package unidade5;

import java.util.Scanner;

public class Uni5Exe16 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double somaAlturaGrupo = 0;
		double somaAlturaMulheres = 0;
		int quantMulheres = 0;
		int quantPessoas = 0;
		
		System.out.print("Digite a altura da pessoa: ");
		double altura = ler.nextDouble();
		
		while(altura != 0) {
			System.out.print("Digite o sexo da pessoa(M/F): ");
			char sexo = ler.next().trim().toUpperCase().charAt(0);
			if(sexo == 'F') {
				somaAlturaMulheres += altura;
				quantMulheres++;
			}
			somaAlturaGrupo +=altura;
			quantPessoas++;
			System.out.print("Digite a altura da pessoa: ");
			altura = ler.nextDouble();
		}
		
		double mediaAlturaMulher = somaAlturaMulheres / quantMulheres;
		double mediaAlturaGrupo = somaAlturaGrupo / quantPessoas;
		
		System.out.println("Média do grupo: " + mediaAlturaGrupo + "\nMédia das mulheres: " + mediaAlturaMulher);
			
		ler.close();
	}

}
