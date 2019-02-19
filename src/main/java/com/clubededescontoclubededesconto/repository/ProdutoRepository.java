package com.clubededescontoclubededesconto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.clubededescontoclubededesconto.domain.Produto;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
	
}
