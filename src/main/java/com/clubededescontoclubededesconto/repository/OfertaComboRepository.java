package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.OfertaPorCombo;

@Repository
public interface OfertaComboRepository extends MongoRepository<OfertaPorCombo, String> {
	
}
