package javaWhile;

public class WhileDeterminado {
	public static void main(String[] args) {
		// o while é como uma lista de verificação: ele só faz o trabalho se a condição for verdadeira.
		
		// criamos uma variável para contar as repetições
		int contador = 1;
		
		// Enquanto o contador for menor ou igual a 10, faça o que está aqui dentro
		while(contador <=10) {
			System.out.println("Bom dia!");
			
			// Soma +1 ao contador. 
			// Sem isso, o contador seria sempre 1 e o programa ficaria preso para sempre!
			contador++;
		}
	}
}
