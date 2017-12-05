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
	
	@RequestMapping(value = "/eletricista",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCasa>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCasa> findByEletricista = subcategoriaCasaRepository.findByEletricista("1");
		return new ResponseEntity<>(findByEletricista, HttpStatus.OK);
	}
	@RequestMapping(value = "/pintor",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCasa>> findByIdProfissionalPintor(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCasa> findByPintor = subcategoriaCasaRepository.findByPintor("1");
		return new ResponseEntity<>(findByPintor, HttpStatus.OK);
	}
	@RequestMapping(value = "/diarista",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCasa>> findByIdProfissionalDiarista(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCasa> findByDiarista = subcategoriaCasaRepository.findByDiarista("1");
		return new ResponseEntity<>(findByDiarista, HttpStatus.OK);
	}
	@RequestMapping(value = "/cozinheira",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCasa>> findByIdProfissionalCozinheira(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCasa> findByCozinheira = subcategoriaCasaRepository.findByCozinheira("1");
		return new ResponseEntity<>(findByCozinheira, HttpStatus.OK);
	}
	@RequestMapping(value = "/jardineiro",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCasa>> findByIdProfissionalJardineiro(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCasa> findByJardineiro = subcategoriaCasaRepository.findByJardineiro("1");
		return new ResponseEntity<>(findByJardineiro, HttpStatus.OK);
	}
	@RequestMapping(value = "/motorista",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCasa>> findByIdProfissionalMotorista(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCasa> findByMotorista = subcategoriaCasaRepository.findByMotorista("1");
		return new ResponseEntity<>(findByMotorista, HttpStatus.OK);
	}
}