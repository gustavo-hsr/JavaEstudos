package javaWhile;

public class For1 {
	public static void main(String[] args) {
		
		// O laço 'for' tem 3 partes: 
				//  Criar a variável (int contador = 0)
				//  Definir até onde vai (contador <= 10)
				//  Somar +1 a cada volta (contador++)
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
	}
}
