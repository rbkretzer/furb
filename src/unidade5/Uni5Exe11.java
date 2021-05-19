package unidade5;

public class Uni5Exe11 {

	public static void main(String[] args) {

		int biscoitosQuebrados = 0;

		for (int i = 0; i < 16; i++) {
			biscoitosQuebrados += Math.pow(3, i);
		}

		System.out.println("A quantidade de biscoitos quebrados no final do dia é de " + biscoitosQuebrados);
	}

}
