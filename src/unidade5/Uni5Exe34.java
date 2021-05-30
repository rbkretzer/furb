package unidade5;

import java.util.Scanner;

public class Uni5Exe34 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		boolean continua = true;
		int opcao = 0;
		int diarias = 0;
		String hospede = "";
		double conta = 0;
		int contasEncerradas = 0;
		do {
			System.out.println("Selecione uma das seguintes op��es:\n(1) Encerrar a conta de um h�spede\n"
					+ "(2) Verificar n�mero de contas encerradas\n"
					+ "(3) Sair");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do h�spede: ");
				hospede = ler.next();		
				System.out.print("Digite o n�mero de di�rias do h�spede: ");
				diarias = ler.nextInt();
				if (diarias > 15) {
					conta = (50.0 * diarias) + (diarias * 5.0);
				} else if (diarias < 15) {
					conta = (50.0 * diarias) + (diarias * 7.50);
				} else {
					conta = (50.0 * diarias) + (diarias * 6.50);
				}
				System.out.println("O h�spede " + hospede + " deve pagar " + conta + "R$.");
				contasEncerradas++;
				break;
			case 2:
				System.out.println("O quantidade de contas encerradas foi de " + contasEncerradas);
				break;
			case 3: 
				continua = false;
				break;
			default: System.out.println("Op��o inv�lida.");	
			}
			
		} while (continua);
		
		ler.close();
		
	}

}
