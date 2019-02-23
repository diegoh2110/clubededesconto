package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.OfertaPorValor;

@Repository
public interface OfertaValorRepository extends MongoRepository<OfertaPorValor, String> {
	
}
