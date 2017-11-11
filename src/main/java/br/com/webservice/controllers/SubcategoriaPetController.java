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
import br.com.webservice.dao.SubcategoriaPetRepository;
import br.com.webservice.dao.SubcategoriaVeiculoRepository;
import br.com.webservice.model.SubcategoriaCasa;
import br.com.webservice.model.SubcategoriaPet;
import br.com.webservice.model.SubcategoriaVeiculo;


@RestController
@RequestMapping("/api/subcategoria-pet")
public class SubcategoriaPetController {
	
	@Autowired
	private SubcategoriaPetRepository subcategoriaPetRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaPet> create(@RequestBody SubcategoriaPet subcategoriaPet) {
		subcategoriaPet = subcategoriaPetRepository.save(subcategoriaPet);
		return new ResponseEntity<>(subcategoriaPet, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/adestrador",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPet>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPet> findByAdestrador = subcategoriaPetRepository.findByAdestrador("1");
		return new ResponseEntity<>(findByAdestrador, HttpStatus.OK);
	}
	@RequestMapping(value = "/passeador",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPet>> findByIdProfissionalPasseador(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPet> findByPasseador = subcategoriaPetRepository.findByPasseador("1");
		return new ResponseEntity<>(findByPasseador, HttpStatus.OK);
	}
	@RequestMapping(value = "/banho",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPet>> findByIdProfissionalBanho(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPet> findByBanho = subcategoriaPetRepository.findByBanho("1");
		return new ResponseEntity<>(findByBanho, HttpStatus.OK);
	}
	@RequestMapping(value = "/hospedagem",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPet>> findByIdProfissionalHospedagem(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPet> findByHospedagem = subcategoriaPetRepository.findByHospedagem("1");
		return new ResponseEntity<>(findByHospedagem, HttpStatus.OK);
	}
	@RequestMapping(value = "/taxi",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPet>> findByIdProfissionalTaxi(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPet> findByTaxi = subcategoriaPetRepository.findByTaxi("1");
		return new ResponseEntity<>(findByTaxi, HttpStatus.OK);
	}
	@RequestMapping(value = "/veterinario",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaPet>> findByIdProfissionalVeterinario(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaPet> findByVeterinario = subcategoriaPetRepository.findByVeterinario("1");
		return new ResponseEntity<>(findByVeterinario, HttpStatus.OK);
	}
}