package com.clubededescontoclubededesconto.domain;

import java.io.Serializable;

public class OfertaAtacado implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer quantidade1;
	private Double valor1;
	private Integer quantidade2;
	private Double valor2;
	private Integer quantidade3;
	private Double valor3;
	
	public OfertaAtacado() {
	}

	public OfertaAtacado(Integer quantidade1, Double valor1, Integer quantidade2, Double valor2, Integer quantidade3,
			Double valor3) {
		super();
		this.quantidade1 = quantidade1;
		this.valor1 = valor1;
		this.quantidade2 = quantidade2;
		this.valor2 = valor2;
		this.quantidade3 = quantidade3;
		this.valor3 = valor3;
	}

	public Integer getQuantidade1() {
		return quantidade1;
	}

	public void setQuantidade1(Integer quantidade1) {
		this.quantidade1 = quantidade1;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Integer getQuantidade2() {
		return quantidade2;
	}

	public void setQuantidade2(Integer quantidade2) {
		this.quantidade2 = quantidade2;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Integer getQuantidade3() {
		return quantidade3;
	}

	public void setQuantidade3(Integer quantidade3) {
		this.quantidade3 = quantidade3;
	}

	public Double getValor3() {
		return valor3;
	}

	public void setValor3(Double valor3) {
		this.valor3 = valor3;
	}
	
	

}
