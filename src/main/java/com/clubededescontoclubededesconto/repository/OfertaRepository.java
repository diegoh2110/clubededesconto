package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.Oferta;

@Repository
public interface OfertaRepository extends MongoRepository<Oferta, String> {
	
}
