package unidade5;

public class Uni5Exe04 {

	public static void main(String[] args) {
		
		double soma = 0;
		double dividendo = 3;
		double divisor = 2;
		
		for (int i = 2; i <= 20; i++) {	 
			soma += dividendo/divisor;
			divisor = dividendo + divisor + 1;
			dividendo += 2; 
		}
		
		System.out.println(soma);
		
	}

}
