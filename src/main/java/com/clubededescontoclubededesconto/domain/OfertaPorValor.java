package com.clubededescontoclubededesconto.domain;

import java.io.Serializable;

public class OfertaPorValor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Double de;
	private Double por;
	
	public OfertaPorValor() {
	}

	public OfertaPorValor(Double de, Double por) {
		super();
		this.de = de;
		this.por = por;
	}

	public Double getDe() {
		return de;
	}

	public void setDe(Double de) {
		this.de = de;
	}

	public Double getPor() {
		return por;
	}

	public void setPor(Double por) {
		this.por = por;
	}
	
	

}
