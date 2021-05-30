package unidade5;

import java.util.Scanner;

public class Uni5Exe32 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o valor que corresponde ao dia da semana que o m�s come�a:"
				+ "\n1 - Domingo\n2 - Segunda\n3 - Ter�a\n4 - Quarta\n5 - Quinta\n6 - Sexta\n7 - S�bado");
		int diaDaSemanaInicio = ler.nextInt();
		while(diaDaSemanaInicio < 1 || diaDaSemanaInicio > 7) {
			System.out.println("Dia da semana inv�lido.");
			System.out.println("Digite o valor que corresponde ao dia da semana que o m�s come�a:"
					+ "\n1 - Domingo\n2 - Segunda\n3 - Ter�a\n4 - Quarta\n5 - Quinta\n6 - Sexta\n7 - S�bado");
			diaDaSemanaInicio = ler.nextInt();
		}
		
		System.out.print("Digite quantos dias tem o m�s: ");
		int diasMes = ler.nextInt();
		
		while(diasMes < 28 || diasMes > 31) {
			System.out.print("Quantidade de dias inv�lido.");
			System.out.print("Digite quantos dias tem o m�s: ");
			diasMes = ler.nextInt();
		}
		
		String calendario = " D  S  T  Q  Q  S  S\n";
		int diaDaSemana = 1;
		
		while(diaDaSemana != diaDaSemanaInicio) {
			calendario += "   ";
			diaDaSemana++;
		}
		
		int dia = 1;
		while(dia <= diasMes) {
			if (diaDaSemana != 7) {
				calendario += dia + " ";
				if (dia < 10) {
					calendario += " ";
				}
				diaDaSemana++;
			} else {
				calendario += dia + "\n";
				diaDaSemana = 1;
			}
			dia++;
		}
		
		System.out.println(calendario);
		
		ler.close();

	}

}
