package com.clubededescontoclubededesconto.dto;

import java.io.Serializable;

import com.clubededescontoclubededesconto.domain.Loja;

public class LojaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	private String telefone;

	public LojaDTO() {
	}

	public LojaDTO(Loja obj) {
		id = obj.getId();
		nome = obj.getNome();
		telefone = obj.getTelefone();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
