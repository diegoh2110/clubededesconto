package com.clubededescontoclubededesconto.config;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.clubededescontoclubededesconto.domain.Loja;
import com.clubededescontoclubededesconto.domain.Oferta;
import com.clubededescontoclubededesconto.domain.OfertaAtacado;
import com.clubededescontoclubededesconto.domain.OfertaPorCombo;
import com.clubededescontoclubededesconto.domain.OfertaPorQuantidade;
import com.clubededescontoclubededesconto.domain.OfertaPorValor;
import com.clubededescontoclubededesconto.domain.Panfleto;
import com.clubededescontoclubededesconto.domain.Produto;
import com.clubededescontoclubededesconto.repository.LojaRepository;
import com.clubededescontoclubededesconto.repository.OfertaAtacadoRepository;
import com.clubededescontoclubededesconto.repository.OfertaComboRepository;
import com.clubededescontoclubededesconto.repository.OfertaQuantidadeRepository;
import com.clubededescontoclubededesconto.repository.OfertaRepository;
import com.clubededescontoclubededesconto.repository.OfertaValorRepository;
import com.clubededescontoclubededesconto.repository.PanfletoRepository;
import com.clubededescontoclubededesconto.repository.ProdutoRepository;
import com.clubededescontoclubededesconto.service.cep.EnderecoTO;

@Configuration
public class Instantiation implements CommandLineRunner{

	Timestamp t = new Timestamp(System.currentTimeMillis());
	
	@Autowired
	private LojaRepository lojaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private OfertaRepository ofertaRepository;
	
	@Autowired
	private OfertaValorRepository ofertaValorRepository;
	
	@Autowired
	private OfertaQuantidadeRepository ofertaQuantidadeRepository;
	
	@Autowired
	private OfertaComboRepository ofertaComboRepository;
	
	@Autowired
	private OfertaAtacadoRepository ofertaAtacadoRepository;
	
	@Autowired
	private PanfletoRepository panfletoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
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
		
		ofertaValorRepository.deleteAll();
		
		OfertaPorValor ofertaValor1 = new OfertaPorValor(1.99, 0.99);
		OfertaPorValor ofertaValor2 = new OfertaPorValor(2.99, 1.99);
		OfertaPorValor ofertaValor3 = new OfertaPorValor(3.99, 2.99);
		
		ofertaValorRepository.saveAll(Arrays.asList(ofertaValor1,ofertaValor2,ofertaValor3));
		
		ofertaQuantidadeRepository.deleteAll();
		
		OfertaPorQuantidade ofertaQuantidade1 = new OfertaPorQuantidade(3, 0.99);
		OfertaPorQuantidade ofertaQuantidade2 = new OfertaPorQuantidade(4, 1.99);
		OfertaPorQuantidade ofertaQuantidade3 = new OfertaPorQuantidade(5, 2.99);
		
		ofertaQuantidadeRepository.saveAll(Arrays.asList(ofertaQuantidade1,ofertaQuantidade2,ofertaQuantidade3));
		
		ofertaComboRepository.deleteAll();
		
		OfertaPorCombo ofertaCombo1 = new OfertaPorCombo(5, 5.99);
		OfertaPorCombo ofertaCombo2 = new OfertaPorCombo(6, 6.99);
		OfertaPorCombo ofertaCombo3 = new OfertaPorCombo(7, 7.99);
		
		ofertaComboRepository.saveAll(Arrays.asList(ofertaCombo1,ofertaCombo2,ofertaCombo3));
		
		ofertaAtacadoRepository.deleteAll();
		
		OfertaAtacado ofertaAtacado1 = new OfertaAtacado(3, 0.99, 4, 1.99, 5, 2.99);
		OfertaAtacado ofertaAtacado2 = new OfertaAtacado(6, 0.99, 7, 1.99, 8, 2.99);
		OfertaAtacado ofertaAtacado3 = new OfertaAtacado(9, 0.99, 10, 1.99, 11, 2.99);
		
		ofertaAtacadoRepository.saveAll(Arrays.asList(ofertaAtacado1,ofertaAtacado2,ofertaAtacado3));
		
		ofertaRepository.deleteAll();
		
		Oferta oferta1 = new Oferta(null, "adasd1a5sd1a5sd1", sdf.parse("22/02/2019") ,sdf.parse("25/02/2019") , ofertaValor1);
		Oferta oferta2 = new Oferta(null, "adasd1a5sd1a5sd1", sdf.parse("22/02/2019") ,sdf.parse("25/02/2019") , ofertaValor2);
		Oferta oferta3 = new Oferta(null, "adasd1a5sd1a5sd1", sdf.parse("22/02/2019") ,sdf.parse("27/02/2019") , ofertaQuantidade1);
		Oferta oferta4 = new Oferta(null, "adasd1a5sd1a5sd1", sdf.parse("22/02/2019") ,sdf.parse("28/02/2019") , ofertaCombo1);
		Oferta oferta5 = new Oferta(null, "adasd1a5sd1a5sd1", sdf.parse("22/02/2019") ,sdf.parse("29/02/2019") , ofertaAtacado1);
		
		ofertaRepository.saveAll(Arrays.asList(oferta1,oferta2,oferta3,oferta4,oferta5));
		
		panfletoRepository.deleteAll();
		
		Panfleto panfleto1 = new Panfleto(null, "Panfleto 1", sdf.parse("23/02/2019"), sdf.parse("28/02/2019"), "/mnt/dados/diego/arquivo1.pdf");
		Panfleto panfleto2 = new Panfleto(null, "Panfleto 2", sdf.parse("23/02/2019"), sdf.parse("29/02/2019"), "/mnt/dados/diego/arquivo1.pdf");
		Panfleto panfleto3 = new Panfleto(null, "Panfleto 3", sdf.parse("23/02/2019"), sdf.parse("30/02/2019"), "/mnt/dados/diego/arquivo1.pdf");
		
		panfletoRepository.saveAll(Arrays.asList(panfleto1,panfleto2,panfleto3));
	}

}
