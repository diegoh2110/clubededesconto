package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.Panfleto;

@Repository
public interface PanfletoRepository extends MongoRepository<Panfleto, String> {
	
}
