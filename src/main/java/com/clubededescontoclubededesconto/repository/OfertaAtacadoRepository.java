package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.OfertaAtacado;

@Repository
public interface OfertaAtacadoRepository extends MongoRepository<OfertaAtacado, String> {
	
}
