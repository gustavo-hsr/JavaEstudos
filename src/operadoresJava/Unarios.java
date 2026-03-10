package operadoresJava;

public class Unarios {

	public static void main(String[] args) {
		// Usados para adicionar ou subtrair 1. 
		// Podem ser prefixados (antes) ou posfixados (depois) da variável, afetando o momento da atualização.
		int contador1 = 10;
		int contador2 = 10;
		System.out.println(++contador1); // contador passar a ser 11 e é impresso.
		System.out.println(contador2++); // contador é impresso, depois passa a ser 11.

	}

}
