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
import br.com.webservice.dao.SubcategoriaCursoRepository;
import br.com.webservice.model.SubcategoriaCurso;


@RestController
@RequestMapping("/api/subcategoria-curso")
public class SubcategoriaCursoController {
	
	@Autowired
	private SubcategoriaCursoRepository subcategoriaCursoRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaCurso> create(@RequestBody SubcategoriaCurso subcategoriaCurso) {
		subcategoriaCurso = subcategoriaCursoRepository.save(subcategoriaCurso);
		return new ResponseEntity<>(subcategoriaCurso, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/culinaria",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCurso>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCurso> findByCulinaria = subcategoriaCursoRepository.findByCulinaria("1");
		return new ResponseEntity<>(findByCulinaria, HttpStatus.OK);
	}
	@RequestMapping(value = "/idiomas",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCurso>> findByIdProfissionalIdiomas(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCurso> findByIdiomas = subcategoriaCursoRepository.findByIdiomas("1");
		return new ResponseEntity<>(findByIdiomas, HttpStatus.OK);
	}
	@RequestMapping(value = "/danca",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCurso>> findByIdProfissionalDanca(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCurso> findByDanca = subcategoriaCursoRepository.findByDanca("1");
		return new ResponseEntity<>(findByDanca, HttpStatus.OK);
	}
	@RequestMapping(value = "/judo",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCurso>> findByIdProfissionalJudo(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCurso> findByJudo = subcategoriaCursoRepository.findByJudo("1");
		return new ResponseEntity<>(findByJudo, HttpStatus.OK);
	}
	@RequestMapping(value = "/musica",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCurso>> findByIdProfissionalMusica(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCurso> findByMusica = subcategoriaCursoRepository.findByMusica("1");
		return new ResponseEntity<>(findByMusica, HttpStatus.OK);
	}
	@RequestMapping(value = "/artesanato",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaCurso>> findByIdProfissionalArtesanato(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaCurso> findByArtesanato = subcategoriaCursoRepository.findByArtesanato("1");
		return new ResponseEntity<>(findByArtesanato, HttpStatus.OK);
	}
	
}