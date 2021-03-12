package br.com.alura.reactive.streams;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NotaFiscalSubscriber implements Subscriber<NotaFiscal>{

	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) {
		System.out.println("Chamando o onSubscribe");
		
		this.subscription = subscription;
		this.subscription.request(1);
		
	}

	@Override
	public void onNext(NotaFiscal nota) {
		System.out.println("\nChamando o onNext");
		NotaFiscalWSClient ws = new NotaFiscalWSClient();
		ws.enviar(nota);
		this.subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
	}

	@Override
	public void onComplete() {
		System.out.println("\nTodas as notas foram emitidas!");
	}

}
