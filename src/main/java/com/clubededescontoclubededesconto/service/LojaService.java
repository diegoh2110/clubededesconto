package com.clubededescontoclubededesconto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubededescontoclubededesconto.domain.Loja;
import com.clubededescontoclubededesconto.dto.LojaDTO;
import com.clubededescontoclubededesconto.repository.LojaRepository;
import com.clubededescontoclubededesconto.service.exception.ObjectNotFoundException;

@Service
public class LojaService {

	@Autowired
	private LojaRepository repo;

	public List<Loja> findAll() {

		return repo.findAll();
	}

	public Loja findById(String id) {
		Optional<Loja> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public Loja insert(Loja obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public Loja fromDTO(LojaDTO objDto) {
		return new Loja(objDto.getId(), objDto.getNome(), objDto.getTelefone());
	}

	public Loja update(Loja obj) {
		Loja newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Loja newObj, Loja obj) {
		newObj.setNome(obj.getNome());
		newObj.setTelefone(obj.getTelefone());

	}

}
