package javaSwitch;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// Definimos a cor da faixa atual
		String faixa = "marrom";
		
		/* * O switch analisa o valor da variável 'faixa'.
         * .toLowerCase() garante que, mesmo se escrever "BRANCA", 
         * o Java entenda como "marrom".
         */
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "amarela":
			System.out.println("Sei o Heian Nidan");
			
		}
	}

}
