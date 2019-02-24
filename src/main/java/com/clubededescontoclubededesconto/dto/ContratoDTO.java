package com.clubededescontoclubededesconto.dto;

import java.io.Serializable;

import com.clubededescontoclubededesconto.domain.Contrato;

public class ContratoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String descricao;
	
	public ContratoDTO() {
	}
	
	public ContratoDTO(Contrato obj) {
		id = obj.getId();
		descricao = obj.getDescricao();
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
	
	

}
