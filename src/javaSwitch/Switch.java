package javaSwitch;

public class Switch {
	public static void main(String[] args) {
	
		String dia = "Terça-Feira";
		
				switch (dia) {
				case "Domingo":
					System.out.println("Domingo");
					break;
				case "Segunda-Feira":
					System.out.println("Segunda-Feira");
					break;
				case "Terça-Feira":
					System.out.println("Terça-Feira");
					break;
				case "Quarta-Feira":
					System.out.println("Quarta-Feira");
					break;
				case "Quinta-Feira":
					System.out.println("Quinta-Feira");
					break;
				case "Sexta-Feira":
					System.out.println("Sexta-Feira");
					break;
				case "Sabado": 
					System.out.println("Sábado");
					break;
				default:
						System.out.println("Dia não econtrado! Verique se escreveu igual ao case.");
				}
}
}
