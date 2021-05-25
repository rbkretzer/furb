package unidade5;

public class Uni5Exe10 {

	public static void main(String[] args) {
		
		int valorAtual = 1;
		int valorMetade1 = 0;
		int valorMetade2 = 0;
		int comparador = 0;
		
		for (int i = 1; i <= 10; i++) {
			comparador = 0;
			for (int count = valorAtual; count != comparador; count++) {
				
				double valor = Math.pow(count, 2);
				
				String valorTexto = String.valueOf(valor);
				
				int posicaoPonto = valorTexto.indexOf(".");
				
				String valorInteiroTexto = valorTexto.substring(0, posicaoPonto);
				
				int tamanhoValor = valorInteiroTexto.length(); 
				int tamanhoValorMetade = tamanhoValor/2;
				
				String metade1 = valorInteiroTexto.substring(0, tamanhoValorMetade);
				String metade2 = valorInteiroTexto.substring(tamanhoValorMetade);
				
				if (metade1.length() > 0) {
					valorMetade1 = Integer.parseInt(metade1);					
				}
				if (metade2.length() > 0) {
					valorMetade2 = Integer.parseInt(metade2);					
				}
				
				int soma = valorMetade1 + valorMetade2;
				
				if(soma == count) {
					System.out.println(Integer.parseInt(valorInteiroTexto));
					valorAtual = Integer.parseInt(valorInteiroTexto) + 1;
					comparador = valorAtual;
				}
				
			}
		}
		
	}

}
