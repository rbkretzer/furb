package unidade5;

public class Uni5Exe11 {

	public static void main(String[] args) {
		
		int biscoitosQuebrados = 1;
		
		for(int hora = 2; hora <= 16; hora++) {
			biscoitosQuebrados *= 3; 
		}
		
		System.out.println("A quantidade de biscoitos quebrados no final do dia é de " + (biscoitosQuebrados + 1));
	}

}
