package br.com.webservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.dao.SubcategoriaPessoalRepository;
import br.com.webservice.model.SubcategoriaPessoal;


@RestController
@RequestMapping("/api/subcategoria-pessoal")
public class SubcategoriaPessoalController {
	
	@Autowired
	private SubcategoriaPessoalRepository subcategoriaPessoalRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaPessoal> create(@RequestBody SubcategoriaPessoal subcategoriaPessoal) {
		subcategoriaPessoal = subcategoriaPessoalRepository.save(subcategoriaPessoal);
		return new ResponseEntity<>(subcategoriaPessoal, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/cabelereiro",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPessoal>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPessoal> findByCabelereiro = subcategoriaPessoalRepository.findByCabelereiro("1");
		return new ResponseEntity<>(findByCabelereiro, HttpStatus.OK);
	}
	@RequestMapping(value = "/costura",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPessoal>> findByIdProfissionalCustura(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPessoal> findByCustura = subcategoriaPessoalRepository.findByCostura("1");
		return new ResponseEntity<>(findByCustura, HttpStatus.OK);
	}
	@RequestMapping(value = "/manicure",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPessoal>> findByIdProfissionalManicure(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPessoal> findByManicure = subcategoriaPessoalRepository.findByManicure("1");
		return new ResponseEntity<>(findByManicure, HttpStatus.OK);
	}
	@RequestMapping(value = "/maquiador",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPessoal>> findByIdProfissionalMaquiador(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPessoal> findByMaquiador = subcategoriaPessoalRepository.findByMaquiador("1");
		return new ResponseEntity<>(findByMaquiador, HttpStatus.OK);
	}
	@RequestMapping(value = "/Personal",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPessoal>> findByIdProfissionalPersonal(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPessoal> findByPersonal = subcategoriaPessoalRepository.findByPersonal("1");
		return new ResponseEntity<>(findByPersonal, HttpStatus.OK);
	}
	
}