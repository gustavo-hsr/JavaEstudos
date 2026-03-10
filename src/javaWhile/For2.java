package javaWhile;

public class For2 {
	public static void main(String[] args) {
		
		// O comando 'for' tem 3 partes principais separadas por ';'
				// 1. int contador = 10 -> Começamos o número em 10.
				// 2. contador >= 0     -> O código vai rodar ENQUANTO o contador for maior ou igual a 0.
				// 3. contador -= 2     -> A cada volta, SUBTRAÍMOS 2 do valor atual.
		for(int contador = 10; contador >= 0; contador -=2) {
			
			// O %d é um espaço reservado que será preenchido pelo valor da variável 'contador'
						// O \n serve para pular uma linha após imprimir
			System.out.printf("Contador = %d\n", contador);
		}
	}
}
