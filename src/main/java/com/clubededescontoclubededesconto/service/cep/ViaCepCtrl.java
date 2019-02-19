package com.clubededescontoclubededesconto.service.cep;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ViaCepCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@GetMapping(value = "/getCep/{cep}")
	public ResponseEntity<EnderecoTO> doObterCep(@PathVariable(name = "cep") String cep) {

		RestTemplate restTemplate = new RestTemplate();

		String uri = "http://viacep.com.br/ws/{cep}/json/";

		Map<String, String> params = new HashMap<String, String>();
		params.put("cep", cep);

		return ResponseEntity.ok(restTemplate.getForObject(uri, EnderecoTO.class, params));

	}

}
