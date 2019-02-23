package com.clubededescontoclubededesconto.domain;

import java.io.Serializable;

public class OfertaPorQuantidade implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer quantiddade;
	private Double valor;

	public OfertaPorQuantidade() {
	}

	public OfertaPorQuantidade(Integer quantiddade, Double valor) {
		super();
		this.quantiddade = quantiddade;
		this.valor = valor;
	}

	public Integer getQuantiddade() {
		return quantiddade;
	}

	public void setQuantiddade(Integer quantiddade) {
		this.quantiddade = quantiddade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
