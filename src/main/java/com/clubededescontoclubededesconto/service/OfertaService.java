package com.clubededescontoclubededesconto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubededescontoclubededesconto.domain.Oferta;
import com.clubededescontoclubededesconto.dto.OfertaDTO;
import com.clubededescontoclubededesconto.repository.OfertaRepository;
import com.clubededescontoclubededesconto.service.exception.ObjectNotFoundException;

@Service
public class OfertaService {
	
	@Autowired
	private OfertaRepository repo;
	
	public List<Oferta> findAll() {

		return repo.findAll();
	}
	
	public Oferta insert(Oferta obj) {
		return repo.insert(obj);
	}

	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public Oferta findById(String id) {
		Optional<Oferta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Oferta fromDTO(OfertaDTO objDto) {
		return new Oferta(objDto.getId(),objDto.getProdutoId(),objDto.getInicio(),objDto.getTermino(),objDto.getOfertaValor(),objDto.getOfertaQuantidade(),objDto.getOfertaCombo(),objDto.getOfertaAtacado());
	}
	

	public Oferta update(Oferta obj) {
		Oferta newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(Oferta newObj, Oferta obj) {
		newObj.setInicio(obj.getInicio());
		newObj.setTermino(obj.getTermino());
		newObj.setOfertaValor(obj.getOfertaValor());
		newObj.setOfertaQuantidade(obj.getOfertaQuantidade());
		newObj.setOfertaCombo(obj.getOfertaCombo());
		newObj.setOfertaAtacado(obj.getOfertaAtacado());
	}

}
