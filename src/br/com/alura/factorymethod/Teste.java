package br.com.alura.factorymethod;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	//Novidade Java 9 - Factory Method para Collection.
	public static void main(String[] args) {
		/*
			ArrayList<String> nomes = new ArrayList<>();
			nomes.add("primeiroNome");
			nomes.add("segundoNome");
			nomes.add("terceiroNome");
			List<String> nomesImutavel = Collections.unmodifiableList(nomes);
			System.out.println(nomesImutavel);
		*/
		
		List<String> listaImutavel = List.of("PrimeiroNome", "SegundoNome", "TerceiroNome");
		
		Set<String> setImutavel = Set.of("QuartoNome", "QuintoNome", "SextoNome");
		
		Map<String, String> mapImutavel = Map.of("SetimoNome", "José", "NonoNome", "João", "DecimoNome", "Maria");
		
		System.out.println(listaImutavel);
		System.out.println(setImutavel);
		System.out.println(mapImutavel);
	}
}
