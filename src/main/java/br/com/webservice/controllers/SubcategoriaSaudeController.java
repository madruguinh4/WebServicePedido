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
import br.com.webservice.dao.SubcategoriaSaudeRepository;
import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaSaude;


@RestController
@RequestMapping("/api/subcategoria-saude")
public class SubcategoriaSaudeController {
	
	@Autowired
	private SubcategoriaSaudeRepository subcategoriaSaudeRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaSaude> create(@RequestBody SubcategoriaSaude subcategoriaSaude) {
		subcategoriaSaude = subcategoriaSaudeRepository.save(subcategoriaSaude);
		return new ResponseEntity<>(subcategoriaSaude, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/enfermeira",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaSaude>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaSaude> findByEnfermeira = subcategoriaSaudeRepository.findByEnfermeira("1");
		return new ResponseEntity<>(findByEnfermeira, HttpStatus.OK);
	}
	@RequestMapping(value = "/acompanhante",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaSaude>> findByIdProfissionalAcompanhante(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaSaude> findByAcompanhante = subcategoriaSaudeRepository.findByAcompanhante("1");
		return new ResponseEntity<>(findByAcompanhante, HttpStatus.OK);
	}
	@RequestMapping(value = "/fisioterapeuta",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaSaude>> findByIdProfissionalFisioterapeuta(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaSaude> findByFisioterapeuta = subcategoriaSaudeRepository.findByFisioterapeuta("1");
		return new ResponseEntity<>(findByFisioterapeuta, HttpStatus.OK);
	}
	@RequestMapping(value = "/nutricionista",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaSaude>> findByIdProfissionalNutricionista(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaSaude> findByNutricionista = subcategoriaSaudeRepository.findByNutricionista("1");
		return new ResponseEntity<>(findByNutricionista, HttpStatus.OK);
	}
	@RequestMapping(value = "/psicologo",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaSaude>> findByIdProfissionalPsicologo(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaSaude> findByPsicologo = subcategoriaSaudeRepository.findByPsicologo("1");
		return new ResponseEntity<>(findByPsicologo, HttpStatus.OK);
	}
	@RequestMapping(value = "/cuidador",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaSaude>> findByIdProfissionalCuidador(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaSaude> findByCuidador = subcategoriaSaudeRepository.findByCuidador("1");
		return new ResponseEntity<>(findByCuidador, HttpStatus.OK);
	}
}