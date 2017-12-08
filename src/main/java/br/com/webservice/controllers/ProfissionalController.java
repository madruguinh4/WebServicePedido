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
	@RequestMapping(value = "/",method=RequestMethod.POST)
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
	
	@RequestMapping(value = "/categoria/{categoria}",
			method=RequestMethod.GET)
	public List<Profissional> categoria(@PathVariable("categoria") String categoria) {
		
		List<Profissional> profissionals = new ArrayList<>();
		List<SubcategoriaCasa> subcategoriaCasas = null;
		
		if("eletricista".equalsIgnoreCase(categoria)){
			subcategoriaCasas = subcategoriaCasaRepository.findByEletricista("1");
		}else if("pintor".equalsIgnoreCase(categoria)){
			subcategoriaCasas = subcategoriaCasaRepository.findByPintor("1");
		}else if("diarista".equalsIgnoreCase(categoria)){
			subcategoriaCasas = subcategoriaCasaRepository.findByDiarista("1");
		}else if("cozinheira".equalsIgnoreCase(categoria)){
			subcategoriaCasas = subcategoriaCasaRepository.findByCozinheira("1");
		}else if("jardineiro".equalsIgnoreCase(categoria)){
			subcategoriaCasas = subcategoriaCasaRepository.findByJardineiro("1");
		}else if("motorista".equalsIgnoreCase(categoria)){
			subcategoriaCasas = subcategoriaCasaRepository.findByMotorista("1");
		}
		
		for (SubcategoriaCasa subcategoriaCasa : subcategoriaCasas) {
			Profissional profissional = profissionalRepository.findOne(subcategoriaCasa.getIdProfissional());
			Integer mediaProfisional = subcategoriaCasa.getMediaProfisional();
			profissional.setMediaProfisional(mediaProfisional != null ? mediaProfisional : 0);
			profissionals.add(profissional);
		}			
		
		return profissionals;
	}
	
}