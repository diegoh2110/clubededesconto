package com.clubededescontoclubededesconto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubededescontoclubededesconto.domain.Panfleto;
import com.clubededescontoclubededesconto.dto.PanfletoDTO;
import com.clubededescontoclubededesconto.repository.PanfletoRepository;
import com.clubededescontoclubededesconto.service.exception.ObjectNotFoundException;

@Service
public class PanfletoService {
	
	@Autowired
	private PanfletoRepository repo;
	
	public List<Panfleto> findAll() {

		return repo.findAll();
	}
	
	public Panfleto insert(Panfleto obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public Panfleto findById(String id) {
		Optional<Panfleto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Panfleto fromDTO(PanfletoDTO objDto) {
		return new Panfleto(objDto.getId(),objDto.getDescricao() , objDto.getInicio(), objDto.getTermino(), objDto.getArquivo());
	}
	

	public Panfleto update(Panfleto obj) {
		Panfleto newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Panfleto newObj, Panfleto obj) {
		newObj.setId(obj.getId());
		newObj.setDescricao(obj.getDescricao());
		newObj.setInicio(obj.getInicio());
		newObj.setTermino(obj.getTermino());
		newObj.setArquivo(obj.getArquivo());
	}


}
