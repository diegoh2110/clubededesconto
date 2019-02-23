package com.clubededescontoclubededesconto.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Oferta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String produtoId;
	private Date inicio;
	private Date termino;
	private OfertaPorValor ofertaValor;
	private OfertaPorQuantidade ofertaQuantidade;
	private OfertaPorCombo ofertaCombo;
	private OfertaAtacado ofertaAtacado;

	public Oferta() {
	}

	public Oferta(String id,String produtoId, Date inicio, Date termino, OfertaPorValor ofertaValor) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.inicio = inicio;
		this.termino = termino;
		this.ofertaValor = ofertaValor;
	}

	public Oferta(String id,String produtoId, Date inicio, Date termino, OfertaPorQuantidade ofertaQuantidade) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.inicio = inicio;
		this.termino = termino;
		this.ofertaQuantidade = ofertaQuantidade;
	}

	public Oferta(String id,String produtoId, Date inicio, Date termino, OfertaPorCombo ofertaCombo) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.inicio = inicio;
		this.termino = termino;
		this.ofertaCombo = ofertaCombo;
	}

	public Oferta(String id,String produtoId, Date inicio, Date termino, OfertaAtacado ofertaAtacado) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.inicio = inicio;
		this.termino = termino;
		this.ofertaAtacado = ofertaAtacado;
	}
	

	public Oferta(String id, String produtoId, Date inicio, Date termino, OfertaPorValor ofertaValor,
			OfertaPorQuantidade ofertaQuantidade, OfertaPorCombo ofertaCombo, OfertaAtacado ofertaAtacado) {
		super();
		this.id = id;
		this.produtoId = produtoId;
		this.inicio = inicio;
		this.termino = termino;
		this.ofertaValor = ofertaValor;
		this.ofertaQuantidade = ofertaQuantidade;
		this.ofertaCombo = ofertaCombo;
		this.ofertaAtacado = ofertaAtacado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(String produtoId) {
		this.produtoId = produtoId;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getTermino() {
		return termino;
	}

	public void setTermino(Date termino) {
		this.termino = termino;
	}

	public OfertaPorValor getOfertaValor() {
		return ofertaValor;
	}

	public void setOfertaValor(OfertaPorValor ofertaValor) {
		this.ofertaValor = ofertaValor;
	}

	public OfertaPorQuantidade getOfertaQuantidade() {
		return ofertaQuantidade;
	}

	public void setOfertaQuantidade(OfertaPorQuantidade ofertaQuantidade) {
		this.ofertaQuantidade = ofertaQuantidade;
	}

	public OfertaPorCombo getOfertaCombo() {
		return ofertaCombo;
	}

	public void setOfertaCombo(OfertaPorCombo ofertaCombo) {
		this.ofertaCombo = ofertaCombo;
	}

	public OfertaAtacado getOfertaAtacado() {
		return ofertaAtacado;
	}

	public void setOfertaAtacado(OfertaAtacado ofertaAtacado) {
		this.ofertaAtacado = ofertaAtacado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
