package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {
	
	/* var n�o pode ser utilizado na declara��o de atributos de classe
	 var nome = "Jonas";
	*/
	
	//Novidade do Java 10 - Infer�ncia de vari�vel.
	public static void main(String[] args) {
		//HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Jo�o", "04813189");

		System.out.println(cpfPorNomes);
	}
	
	/* var n�o pode ser utilizado como argumento de construtor e m�todos
	public Teste(var nome) {
		
	}*/
}
