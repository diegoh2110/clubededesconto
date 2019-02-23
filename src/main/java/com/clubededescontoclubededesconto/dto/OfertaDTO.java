package com.clubededescontoclubededesconto.dto;

import java.io.Serializable;
import java.util.Date;

import com.clubededescontoclubededesconto.domain.Oferta;
import com.clubededescontoclubededesconto.domain.OfertaAtacado;
import com.clubededescontoclubededesconto.domain.OfertaPorCombo;
import com.clubededescontoclubededesconto.domain.OfertaPorQuantidade;
import com.clubededescontoclubededesconto.domain.OfertaPorValor;

public class OfertaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String produtoId;
	private Date inicio;
	private Date termino;
	private OfertaPorValor ofertaValor;
	private OfertaPorQuantidade ofertaQuantidade;
	private OfertaPorCombo ofertaCombo;
	private OfertaAtacado ofertaAtacado;

	public OfertaDTO() {
	}

	public OfertaDTO(Oferta obj) {
		id = obj.getId();
		produtoId = obj.getProdutoId();
		inicio = obj.getInicio();
		termino = obj.getTermino();
		ofertaValor = obj.getOfertaValor();
		ofertaQuantidade = obj.getOfertaQuantidade();
		ofertaCombo = obj.getOfertaCombo();
		ofertaAtacado = obj.getOfertaAtacado();
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

}
