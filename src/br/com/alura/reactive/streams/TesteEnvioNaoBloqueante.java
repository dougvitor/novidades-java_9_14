package br.com.alura.reactive.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {
	
	public static void main(String[] args) {
		
		try(SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>()){
			
			var notaFiscal = new NotaFiscal("João", new BigDecimal("39.99"), LocalDate.now());

			var ws = new NotaFiscalWSClient();
			
			publisher.consume(ws::enviar);
			publisher.submit(notaFiscal);
			
			System.out.println("Você irá receber a nota fiscal no seu e-mail");
			
			Scanner scan = new Scanner(System.in);
			scan.nextLine();
			scan.close();
		}
	}

}
