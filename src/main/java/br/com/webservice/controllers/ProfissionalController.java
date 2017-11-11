package br.com.webservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.dao.ProfissionalRepository;
import br.com.webservice.dao.SubcategoriaCasaRepository;
import br.com.webservice.model.Profissional;
import br.com.webservice.model.SubcategoriaCasa;


@RestController
@RequestMapping("/api/profissional")
public class ProfissionalController {
	
	@Autowired
	private SubcategoriaCasaRepository subcategoriaCasaRepository;
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST)
	public ResponseEntity<Profissional> create(@RequestBody Profissional profissional) {
		profissional = profissionalRepository.save(profissional);
		System.out.println("passou aqui");
		return new ResponseEntity<Profissional>(profissional, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{email}/{senha}",
					method=RequestMethod.GET)
	public Profissional findByEmailAndSenha(@PathVariable("email") String email,@PathVariable("senha") String senha) {
		
		Profissional profissional = profissionalRepository.findByEmailAndSenha(email, senha);
		
		return profissional;
	}
	
	@RequestMapping(value = "/eletricista",
			method=RequestMethod.GET)
	public List<Profissional> eletricista() {
		
		List<Profissional> profissionals = new ArrayList<>();
		List<SubcategoriaCasa> subcategoriaCasas = subcategoriaCasaRepository.findByEletricista("1");
		for (SubcategoriaCasa subcategoriaCasa : subcategoriaCasas) {
			profissionals.add(profissionalRepository.findOne(subcategoriaCasa.getIdProfissional()));
		}
		
		return profissionals;
	}
	
	
}