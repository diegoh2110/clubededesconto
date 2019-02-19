package com.clubededescontoclubededesconto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clubededescontoclubededesconto.domain.Oferta;
import com.clubededescontoclubededesconto.repository.OfertaRepository;
import com.clubededescontoclubededesconto.service.exception.ObjectNotFoundException;

@Service
public class OfertaService {
	
	@Autowired
	private OfertaRepository repo;
	
	public List<Oferta> findAll() {

		return repo.findAll();
	}

	public Oferta findById(String id) {
		Optional<Oferta> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	

}
