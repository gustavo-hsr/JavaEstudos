package tipoIfElse;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		 // Criando o objeto scanner para ler dados do teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		// Regra 1: Aprovado (Nota entre 7.0 e 10.0)
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		// Regra 2: Recuperação (Nota entre 4.5 e 6.9)
		// Note que mudei para < 7 para não repetir a condição do primeiro IF
		if(media <=7 && media >= 4.5)
		System.out.println("Recuperação");
		
		if(media <4.5 && media >=0) {
			System.out.println("Reprovado");
		}
		// Fechando o recurso para evitar vazamento de memória
		entrada.close();
	}
}
