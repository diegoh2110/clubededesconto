package com.clubededescontoclubededesconto.dto;

import java.io.Serializable;
import java.util.Date;

import com.clubededescontoclubededesconto.domain.Panfleto;

public class PanfletoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String descricao;
	private Date inicio;
	private Date termino;
	private String arquivo;
	
	public PanfletoDTO() {
	}
	
	public PanfletoDTO( Panfleto obj) {
		id = obj.getId();
		descricao = obj.getDescricao();
		inicio = obj.getInicio();
		termino = obj.getTermino();
		arquivo = obj.getArquivo();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	

}
