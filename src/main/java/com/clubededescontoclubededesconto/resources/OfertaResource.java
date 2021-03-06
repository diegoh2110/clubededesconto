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

import com.clubededescontoclubededesconto.domain.Oferta;
import com.clubededescontoclubededesconto.dto.OfertaDTO;
import com.clubededescontoclubededesconto.service.OfertaService;

@RestController
@RequestMapping(value="/ofertas")
public class OfertaResource {
	
	@Autowired
	private OfertaService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<OfertaDTO>> findAll() {
		List<Oferta> list = service.findAll();
		List<OfertaDTO> listDto = list.stream().map(x -> new OfertaDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<OfertaDTO> findById(@PathVariable String id) {
		Oferta obj = service.findById(id);
		return ResponseEntity.ok().body(new OfertaDTO(obj));
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody OfertaDTO objDto) {
		Oferta obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody OfertaDTO objDto, @PathVariable String id) {
		Oferta obj = service.fromDTO(objDto);
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
