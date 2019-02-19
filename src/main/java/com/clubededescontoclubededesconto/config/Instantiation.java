package com.clubededescontoclubededesconto.config;

import java.sql.Timestamp;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.clubededescontoclubededesconto.domain.Loja;
import com.clubededescontoclubededesconto.domain.Produto;
import com.clubededescontoclubededesconto.repository.LojaRepository;
import com.clubededescontoclubededesconto.repository.ProdutoRepository;
import com.clubededescontoclubededesconto.service.cep.EnderecoTO;

@Configuration
public class Instantiation implements CommandLineRunner{

	Timestamp t = new Timestamp(System.currentTimeMillis());
	
	@Autowired
	private LojaRepository lojaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		lojaRepository.deleteAll();
		
		Loja filial1 = new Loja(null, "SG Sistemas 1", "44999895567", new EnderecoTO("87035602"));
		Loja filial2 = new Loja(null, "SG Sistemas 2", "4430262666", new EnderecoTO("87030201"));
		Loja filial3 = new Loja(null, "SG Sistemas 3", "4499999999", new EnderecoTO("87035602"));

		lojaRepository.saveAll(Arrays.asList(filial1,filial2,filial3));
		
		produtoRepository.deleteAll();
		
		Produto produto1 = new Produto(null, "Teste1", "Teste 1", "Marca Teste", " 200 GR", " Fragancia teste", t);
		Produto produto2 = new Produto(null, "Teste2", "Teste 2", "Marca Teste", " 200 GR", " Fragancia teste", t);
		Produto produto3 = new Produto(null, "Teste3", "Teste 3", "Marca Teste", " 200 GR", " Fragancia teste", t);
		
		produtoRepository.saveAll(Arrays.asList(produto1,produto2,produto3));
	}

}
