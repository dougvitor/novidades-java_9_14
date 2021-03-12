package br.com.alura.reactive.streams;

public class NotaFiscalWSClient {
	
	public void enviar (NotaFiscal nf) {
		
		
		try {
			System.out.println("Emitindo nota Fiscal");
			Thread.sleep(5000);
			
			System.out.println(String.format("3 - Thread Name: %s", Thread.currentThread().getName()));
			
			System.out.format("Nota Fiscal emitida em nome de %s na data de %s", nf.getNome(), nf.getData());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
