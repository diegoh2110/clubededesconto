package com.clubededescontoclubededesconto.domain;

import java.io.Serializable;

public class OfertaPorCombo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer quantidade;
	private Double valor;
	
	public OfertaPorCombo() {
	}

	public OfertaPorCombo(Integer quantidade, Double valor) {
		super();
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

}
