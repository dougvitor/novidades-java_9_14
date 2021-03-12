package br.com.alura.reactive.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {
	
	public static void main(String[] args) {
		
		try(SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>()){
			try(Scanner scan = new Scanner(System.in)){
				var notasFiscais = List.of(
						new NotaFiscal("João", new BigDecimal("39.99"), LocalDate.now()),
						new NotaFiscal("Renata", new BigDecimal("41.20"), LocalDate.now()),
						new NotaFiscal("Fernanda", new BigDecimal("15.00"), LocalDate.now())
				    );
				
				
				NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
				publisher.subscribe(subscriber);
				
				notasFiscais.forEach(nota -> publisher.submit(nota));
				
				System.out.println("Você irá receber a nota fiscal no seu e-mail");
				
				scan.nextLine();
			}
			
		}
		
	}

}
