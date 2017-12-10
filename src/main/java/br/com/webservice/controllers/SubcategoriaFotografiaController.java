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

import br.com.webservice.dao.SubcategoriaFotografiaRepository;
import br.com.webservice.model.SubcategoriaFotografia;


@RestController
@RequestMapping("/api/subcategoria-fotografia")
public class SubcategoriaFotografiaController {
	
	@Autowired
	private SubcategoriaFotografiaRepository subcategoriaFotografiaRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaFotografia> create(@RequestBody SubcategoriaFotografia subcategoriaFotografia) {
		subcategoriaFotografia = subcategoriaFotografiaRepository.save(subcategoriaFotografia);
		return new ResponseEntity<>(subcategoriaFotografia, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/aniversario",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaFotografia>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaFotografia> findByAniversario = subcategoriaFotografiaRepository.findByAniversario("1");
		return new ResponseEntity<>(findByAniversario, HttpStatus.OK);
	}
	@RequestMapping(value = "/corporativos",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaFotografia>> findByIdProfissionalCorporativos(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaFotografia> findByCorporativos = subcategoriaFotografiaRepository.findByCorporativos("1");
		return new ResponseEntity<>(findByCorporativos, HttpStatus.OK);
	}
	@RequestMapping(value = "/infantis",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaFotografia>> findByIdProfissionalInfantis(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaFotografia> findByInfantis = subcategoriaFotografiaRepository.findByInfantis("1");
		return new ResponseEntity<>(findByInfantis, HttpStatus.OK);
	}
	@RequestMapping(value = "/casamento",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaFotografia>> findByIdProfissionalCasamento(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaFotografia> findByCasamento = subcategoriaFotografiaRepository.findByCasamento("1");
		return new ResponseEntity<>(findByCasamento, HttpStatus.OK);
	}
	@RequestMapping(value = "/batizado",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaFotografia>> findByIdProfissionalBatizado(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaFotografia> findByBatizado = subcategoriaFotografiaRepository.findByBatizado("1");
		return new ResponseEntity<>(findByBatizado, HttpStatus.OK);
	}
}