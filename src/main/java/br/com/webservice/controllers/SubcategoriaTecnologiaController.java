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
import br.com.webservice.dao.SubcategoriaFotografiaRepository;
import br.com.webservice.dao.SubcategoriaTecnologiaRepository;
import br.com.webservice.dao.SubcategoriaVeiculoRepository;
import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaFotografia;
import br.com.webservice.model.SubcategoriaTecnologia;


@RestController
@RequestMapping("/api/subcategoria-tecnologia")
public class SubcategoriaTecnologiaController {
	
	@Autowired
	private SubcategoriaTecnologiaRepository subcategoriaTecnologiaRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaTecnologia> create(@RequestBody SubcategoriaTecnologia subcategoriaTecnologia) {
		subcategoriaTecnologia = subcategoriaTecnologiaRepository.save(subcategoriaTecnologia);
		return new ResponseEntity<>(subcategoriaTecnologia, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/animacao",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaTecnologia>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaTecnologia> findByAnimacao = subcategoriaTecnologiaRepository.findByAnimacao("1");
		return new ResponseEntity<>(findByAnimacao, HttpStatus.OK);
	}
	@RequestMapping(value = "/desenvolvimento",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaTecnologia>> findByIdProfissionalDesenvolvimento(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaTecnologia> findByDesenvolvimento = subcategoriaTecnologiaRepository.findByDesenvolvimento("1");
		return new ResponseEntity<>(findByDesenvolvimento, HttpStatus.OK);
	}
	@RequestMapping(value = "/audio",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaTecnologia>> findByIdProfissionalAudio(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaTecnologia> findByAudio = subcategoriaTecnologiaRepository.findByAudio("1");
		return new ResponseEntity<>(findByAudio, HttpStatus.OK);
	}
	@RequestMapping(value = "/ilustracao",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaTecnologia>> findByIdProfissionalIlustracao(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaTecnologia> findByIlustracao = subcategoriaTecnologiaRepository.findByIlustracao("1");
		return new ResponseEntity<>(findByIlustracao, HttpStatus.OK);
	}
	@RequestMapping(value = "/marketing",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaTecnologia>> findByIdProfissionalMarketing(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaTecnologia> findByMarketing = subcategoriaTecnologiaRepository.findByMarketing("1");
		return new ResponseEntity<>(findByMarketing, HttpStatus.OK);
	}
	@RequestMapping(value = "/modelagem",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaTecnologia>> findByIdProfissionalModelagem(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaTecnologia> findByModelagem = subcategoriaTecnologiaRepository.findByModelagem("1");
		return new ResponseEntity<>(findByModelagem, HttpStatus.OK);
	}
}