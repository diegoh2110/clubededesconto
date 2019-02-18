package com.clubededescontoclubededesconto.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.clubededescontoclubededesconto.domain.Loja;
import com.clubededescontoclubededesconto.dto.LojaDTO;
import com.clubededescontoclubededesconto.service.LojaService;

@RestController
@RequestMapping(value = "/lojas")
public class LojaResource {

	@Autowired
	private LojaService service;

	/* Cruds da LOJA */

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LojaDTO>> findAll() {
		List<Loja> list = service.findAll();
		List<LojaDTO> listDto = list.stream().map(x -> new LojaDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<LojaDTO> findById(@PathVariable String id) {
		Loja obj = service.findById(id);
		return ResponseEntity.ok().body(new LojaDTO(obj));
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody LojaDTO objDto) {
		Loja obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody LojaDTO objDto, @PathVariable String id) {
		Loja obj = service.fromDTO(objDto);
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable String id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
