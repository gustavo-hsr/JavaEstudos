package tipoIfElse;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita a nota: ");
		
		double nota = entrada.nextDouble();
		
		// Verifica se a nota faz sentido (não pode ser maior que 10 nem menor que 0)
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inválida!");
			// Se a nota for válida e for de 8.1 para cima
		} else if(nota >= 8.1) {
			System.out.println("Conceito A");
			// Para todas as outras notas válidas (menores que 8.1)
		} else {
			// Se estiver entre 6.1 e 8.0
			if(nota >= 6.1) {
				System.out.println("Conceito B");
			}
		}
		// Fecha o leitor de teclado
		entrada.close();
	}

}
