package br.com.alura.reactive.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class TesteEnvioBloqueante {
	
	public static void main(String[] args) {
		var notasFiscais = List.of(
								new NotaFiscal("João", new BigDecimal("39.99"), LocalDate.now()),
								new NotaFiscal("Renata", new BigDecimal("41.20"), LocalDate.now()),
								new NotaFiscal("Fernanda", new BigDecimal("15.00"), LocalDate.now())
						    );
		
		var ws = new NotaFiscalWSClient();
		
		notasFiscais.forEach(nf -> {
			ws.enviar(nf);
			System.out.println("\nCompra Finalizada\n");
		});
	}

}
