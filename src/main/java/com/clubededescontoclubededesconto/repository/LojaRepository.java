package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.Loja;

@Repository
public interface LojaRepository extends MongoRepository<Loja, String> {
	
}
