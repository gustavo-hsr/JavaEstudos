package operadoresJava;

public class Relacionais {

	public static void main(String[] args) {
		
		// Avaliando o aluno
		
		double nota = 7.3; // nesta linha colocamos uma comdição de média do aluno.
		boolean bomComportamento = true; // aqui se o aluno tiver uma média a condição séra true.
		boolean passouPorMedia = nota >= 7; // caso obtenha a média ou acima dela.
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
