package com.clubededescontoclubededesconto.dto;

import java.io.Serializable;
import java.util.Date;

import com.clubededescontoclubededesconto.domain.Oferta;

public class OfertaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private Date inicio;
	private Date termino;
	
	public OfertaDTO() {
	}
	
	public OfertaDTO(Oferta obj) {
		id = obj.getId();
		inicio = obj.getInicio();
		termino = obj.getTermino();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	

}
