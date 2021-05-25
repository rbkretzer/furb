package unidade5;

import java.util.Scanner;

public class Uni5Exe25 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int pontosE = 0;
		int pontosD = 0;
		boolean isMenorQue21 = true;
		boolean isNotDoisPontosMaior = true;
		char lado;
		String vencedor;
		
		
		while(isMenorQue21 && isNotDoisPontosMaior) {
			System.out.print("Digite quem pontuou: ");
			lado = ler.next().trim().toUpperCase().charAt(0);
			
			if (lado == 'E') {
				pontosE++;
			} else {
				pontosD++;
			}
			
			isMenorQue21 = pontosE < 21 || pontosD < 21;
			isNotDoisPontosMaior = pontosE == (pontosD - 2) || pontosD == (pontosE - 2);
		}
		
		if (pontosE > pontosD) {
			vencedor = "Esquerdo!!!";
		} else {
			vencedor = "Direito!!!";
		}
		
		System.out.println("O lado vencedor é o " + vencedor);
		
		ler.close();
	}

}
