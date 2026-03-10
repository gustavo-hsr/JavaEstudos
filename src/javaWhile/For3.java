package javaWhile;

public class For3 {

	public static void main(String[] args) {
		
		// Primeiro laço (externo): controla as LINHAS (i)
		for(int i = 0; i < 10; i++) {
			
			// Segundo laço (interno): controla as COLUNAS (j) de cada linha
			for(int j = 0; j < 10; j++) {
				
				// Imprime os valores no formato [i]. 
				// Nota: No seu código original, faltou o segundo %d para mostrar o 'j'
				System.out.printf("[%d]",i,j);
			}
			
			// Pula para a próxima linha assim que o laço interno termina
			System.out.println();
		}
	}

}
