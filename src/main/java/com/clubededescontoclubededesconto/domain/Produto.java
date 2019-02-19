package com.clubededescontoclubededesconto.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String nome;
	private String nomeAmigavel;
	private String marca;
	private String gramatura;
	private String fragancia;
	private Date ultimaAtualizacao;
	
	public Produto() {
	}

	public Produto(String id, String nome, String nomeAmigavel, String marca, String gramatura, String fragancia,
			Date ultimaAtualizacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.nomeAmigavel = nomeAmigavel;
		this.marca = marca;
		this.gramatura = gramatura;
		this.fragancia = fragancia;
		this.ultimaAtualizacao = ultimaAtualizacao;
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

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public void setNomeAmigavel(String nomeAmigavel) {
		this.nomeAmigavel = nomeAmigavel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGramatura() {
		return gramatura;
	}

	public void setGramatura(String gramatura) {
		this.gramatura = gramatura;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}

	public Date getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(Date ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
