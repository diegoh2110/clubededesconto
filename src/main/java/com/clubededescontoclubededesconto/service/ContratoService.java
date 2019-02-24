package com.clubededescontoclubededesconto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubededescontoclubededesconto.domain.Contrato;
import com.clubededescontoclubededesconto.dto.ContratoDTO;
import com.clubededescontoclubededesconto.repository.ContratoRepository;
import com.clubededescontoclubededesconto.service.exception.ObjectNotFoundException;

@Service
public class ContratoService {

	@Autowired
	private ContratoRepository repo;
	
	public List<Contrato> findAll() {

		return repo.findAll();
	}
	
	public Contrato insert(Contrato obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public Contrato findById(String id) {
		Optional<Contrato> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Contrato fromDTO(ContratoDTO objDto) {
		return new Contrato(objDto.getId(), objDto.getDescricao());
	}
	

	public Contrato update(Contrato obj) {
		Contrato newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Contrato newObj, Contrato obj) {
		newObj.setId(obj.getId());
		newObj.setDescricao(obj.getDescricao());
	}

	
}
