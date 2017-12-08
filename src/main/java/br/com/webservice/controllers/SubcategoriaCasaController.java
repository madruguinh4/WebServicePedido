package br.com.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.dao.SubcategoriaCasaRepository;
import br.com.webservice.model.SubcategoriaCasa;


@RestController
@RequestMapping("/api/subcategoria-casa")
public class SubcategoriaCasaController {
	
	@Autowired
	private SubcategoriaCasaRepository subcategoriaCasaRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaCasa> create(@RequestBody SubcategoriaCasa subcategoriaCasa) {
		subcategoriaCasa = subcategoriaCasaRepository.save(subcategoriaCasa);
		return new ResponseEntity<>(subcategoriaCasa, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/",
			method=RequestMethod.PUT,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaCasa> update(@RequestBody SubcategoriaCasa subcategoriaCasa) {
		subcategoriaCasa = subcategoriaCasaRepository.save(subcategoriaCasa);
		return new ResponseEntity<>(subcategoriaCasa, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{idProfissional}",
			method=RequestMethod.GET)
	public ResponseEntity<SubcategoriaCasa> findById(@PathVariable("idProfissional") Long idProfissional) {
		SubcategoriaCasa subcategoriaCasa = subcategoriaCasaRepository.findByIdProfissional(idProfissional);
		return new ResponseEntity<>(subcategoriaCasa, HttpStatus.OK);
	}
}