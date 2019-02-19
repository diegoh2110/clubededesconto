package com.clubededescontoclubededesconto.dto;

import java.io.Serializable;
import java.util.Date;

import com.clubededescontoclubededesconto.domain.Produto;

public class ProdutoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String nomeAmigavel;
	private String marca;
	private String gramatura;
	private String fragancia;
	private Date ultimaAtualizacao;
	
	public ProdutoDTO() {
	}
	
	public ProdutoDTO(Produto obj) {
		id = obj.getId();
		nome = obj.getNome();
		nomeAmigavel = obj.getNomeAmigavel();
		marca = obj.getMarca();
		gramatura = obj.getGramatura();
		fragancia = obj.getFragancia();
		ultimaAtualizacao = obj.getUltimaAtualizacao();		
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
	
	

}
