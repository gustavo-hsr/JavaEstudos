package javaWhile;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		// Cria o "leitor" de dados do teclado
		Scanner entrada = new Scanner(System.in);
		
		// Cria uma variável vazia para guardar o que o usuário digitar
		String valor = "";
		
		// O 'while' (enquanto) repete o código abaixo enquanto a condição for verdadeira
		// A condição diz: Enquanto o valor NÃO FOR IGUAL a "sair" (ignorando maiúsculas)
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
			
		}
		
		entrada.close();
	}
}
