package br.com.alura.reactive.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {
	
	public static void main(String[] args) {

		final ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		try(SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>(threadPool, 3)){
			
			var notaFiscal = new NotaFiscal("João", new BigDecimal("39.99"), LocalDate.now());

			var ws = new NotaFiscalWSClient();
			
			publisher.consume(ws::enviar);
			publisher.consume(data -> System.out.println(String.format("1 - Thread Name: %s", Thread.currentThread().getName())));
			publisher.consume(data -> System.out.println(String.format("2 - Thread Name: %s", Thread.currentThread().getName())));
			publisher.submit(notaFiscal);
			
			System.out.println("Você irá receber a nota fiscal no seu e-mail");
			
			Scanner scan = new Scanner(System.in);
			scan.nextLine();
			scan.close();
		}
	}

}
