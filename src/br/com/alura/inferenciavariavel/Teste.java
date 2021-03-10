package br.com.alura.inferenciavariavel;

import java.util.HashMap;

public class Teste {
	
	/* var não pode ser utilizado na declaração de atributos de classe
	 var nome = "Jonas";
	*/
	
	//Novidade do Java 10 - Inferência de variável.
	public static void main(String[] args) {
		//HashMap<String, String> cpfPorNomes = new HashMap<String, String>();
		
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("João", "04813189");

		System.out.println(cpfPorNomes);
	}
	
	/* var não pode ser utilizado como argumento de construtor e métodos
	public Teste(var nome) {
		
	}*/
}
