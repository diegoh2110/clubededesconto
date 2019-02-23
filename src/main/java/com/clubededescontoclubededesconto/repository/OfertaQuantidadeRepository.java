package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.OfertaPorQuantidade;

@Repository
public interface OfertaQuantidadeRepository extends MongoRepository<OfertaPorQuantidade, String> {
	
}
