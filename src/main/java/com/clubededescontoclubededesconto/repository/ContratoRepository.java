package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.Contrato;

@Repository
public interface ContratoRepository extends MongoRepository<Contrato, String> {
	
}
