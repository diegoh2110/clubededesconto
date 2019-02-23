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

import com.clubededescontoclubededesconto.domain.Panfleto;
import com.clubededescontoclubededesconto.dto.PanfletoDTO;
import com.clubededescontoclubededesconto.service.PanfletoService;

@RestController
@RequestMapping(value="/panfletos")
public class PanfletoResource {

	@Autowired
	private PanfletoService service;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<PanfletoDTO>> findAll() {
		List<Panfleto> list = service.findAll();
		List<PanfletoDTO> listDto = list.stream().map(x -> new PanfletoDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<PanfletoDTO> findById(@PathVariable String id) {
		Panfleto obj = service.findById(id);
		return ResponseEntity.ok().body(new PanfletoDTO(obj));
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody PanfletoDTO objDto) {
		Panfleto obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody PanfletoDTO objDto, @PathVariable String id) {
		Panfleto obj = service.fromDTO(objDto);
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
