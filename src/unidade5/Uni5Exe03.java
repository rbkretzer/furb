package unidade5;

public class Uni5Exe03 {

	public static void main(String[] args) {
		
		final double dividendo = 1;
		double soma = 0;

		for (double divisor = 1; divisor <= 100; divisor++) {
			soma += dividendo/divisor;
		}
		
		System.out.println(soma);
	}

}
