package unidade5;

public class Uni5Exe21 {

	public static void main(String[] args) {

		double alturaChico = 1.50;
		double alturaZe = 1.10;
		int anos = 0;

		while (alturaChico >= alturaZe) {
			alturaChico += 0.02;
			alturaZe += 0.03;
			anos++;
		}

		System.out.println("Ser�o necess�rios " + anos + " anos para que Z� seja maior que Chico.");

	}

}
