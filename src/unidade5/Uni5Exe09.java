package unidade5;

import java.util.Scanner;

public class Uni5Exe09 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de alunos: ");
		int numAlunos = ler.nextInt();
		
		String nome = "";
		int idade = 0;	
		int maiorVinte = 0;
		
		for (int i = 1; i <= numAlunos; i++) {
			System.out.print("Digite o nome do " + i + "� aluno: ");
			nome = ler.next();
			System.out.print("Digite a idade do " + i + "� aluno: ");
			idade = ler.nextInt();
			
			if(idade == 18) {
				System.out.println(nome);
			} else {
				maiorVinte++;
			}
		}
		
		System.out.println(maiorVinte + " alunos t�m mais que 20 anos");
		
	}

}
