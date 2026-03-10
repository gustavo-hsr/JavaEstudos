package javaWhile;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// Criamos o 'entrada', que funciona como um receptor do teclado
		Scanner entrada = new Scanner(System.in);
		
		// Criamos uma variável vazia para guardar o que o usuário vai digitar
		String texto = "";
		
		// O bloco 'do' significa "FAÇA". Tudo aqui dentro será executado pelo menos uma vez.
		do {
			System.out.println("Você precisa falar"
					+ "as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
			
			// O 'while' significa "ENQUANTO". 
			// Ele checa: "O texto digitado NÃO É IGUAL a 'por favor'?"
			// Se for diferente, ele volta para o início do 'do' e pergunta de novo.
		} while(!texto.equalsIgnoreCase("por favor"));
		
		// Quando você finalmente digita a palavra certa, o laço quebra e chega aqui:
		System.out.println("Obrigado!");
		entrada.close();
		
	}
}
