package br.com.alura.reactive.streams;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NotaFiscal {
	
	private String nome;
	
	private BigDecimal valor;
	
	private LocalDate data;

	public NotaFiscal(String nome, BigDecimal valor, LocalDate data) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
