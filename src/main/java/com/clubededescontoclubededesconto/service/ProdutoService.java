package com.clubededescontoclubededesconto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubededescontoclubededesconto.domain.Produto;
import com.clubededescontoclubededesconto.dto.ProdutoDTO;
import com.clubededescontoclubededesconto.repository.ProdutoRepository;
import com.clubededescontoclubededesconto.service.exception.ObjectNotFoundException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public List<Produto> findAll() {

		return repo.findAll();
	}

	public Produto findById(String id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Produto insert(Produto obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Produto fromDTO(ProdutoDTO objDto) {
		return new Produto(objDto.getId(), objDto.getNome(), objDto.getNomeAmigavel(), objDto.getMarca(),objDto.getGramatura(),objDto.getFragancia(), objDto.getUltimaAtualizacao());
	}

	public Produto update(Produto obj) {
		Produto newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Produto newObj, Produto obj) {
		newObj.setNome(obj.getNome());
		newObj.setNomeAmigavel(obj.getNomeAmigavel());
		newObj.setMarca(obj.getMarca());
		newObj.setGramatura(obj.getGramatura());
		newObj.setFragancia(obj.getFragancia());
		newObj.setUltimaAtualizacao(new java.sql.Timestamp(System.currentTimeMillis()));
	}

}
