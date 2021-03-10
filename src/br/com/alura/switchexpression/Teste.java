package br.com.alura.switchexpression;

public class Teste {

	//Novidades do Java 14 - Switch Expressions.
	public static void main(String[] args) {
		String nome = "João";
		/*switch (nome) {
		case "João": {
			System.out.println("Acertou: " + nome);
			break;
		}
		case "Renata": {
			System.out.println("Acertou: " + nome);
			break;
		}
		default: {
			System.out.println("Nenhum nome encontrado!!");
		}
		}*/
		
		switch(nome) {
		case "João" -> System.out.println("Acertou: " + nome);
		case "Renata" -> System.out.println("Acertou: " + nome);
		default -> System.out.println("Nenhum nome encontrado!!");
		}
	}
}
