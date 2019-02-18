package com.clubededescontoclubededesconto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.clubededescontoclubededesconto.domain.Loja;
import com.clubededescontoclubededesconto.repository.LojaRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private LojaRepository lojaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		lojaRepository.deleteAll();
		
		Loja filial1 = new Loja(null, "SG Sistemas 1", "44999895567");
		Loja filial2 = new Loja(null, "SG Sistemas 2", "4430262666");
		Loja filial3 = new Loja(null, "SG Sistemas 3", "4499999999");

		lojaRepository.saveAll(Arrays.asList(filial1,filial2,filial3));
		
	}

}
