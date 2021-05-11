package unidade5;

public class Uni5Exe02 {

	public static void main(String[] args) {
		int somaImpar = 0;
		int somaPar = 0;
		
		for(int number = 1; number <= 100; number++) {
			if (number % 2 == 0) {
				somaPar += number;
			} else {
				somaImpar += number;
			}
		}
		
		System.out.print(somaPar + "\n" + somaImpar);
	}

}
