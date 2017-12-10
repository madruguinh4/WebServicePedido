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

import br.com.webservice.dao.SubcategoriaVeiculoRepository;
import br.com.webservice.model.SubcategoriaVeiculo;


@RestController
@RequestMapping("/api/subcategoria-veiculo")
public class SubcategoriaVeiculoController {
	
	@Autowired
	private SubcategoriaVeiculoRepository subcategoriaVeiculoRepository;
	
	@RequestMapping("/")
	public String create() {
		return "Testing";
	}
	@RequestMapping(value = "/",
					method=RequestMethod.POST,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SubcategoriaVeiculo> create(@RequestBody SubcategoriaVeiculo subcategoriaVeiculo) {
		subcategoriaVeiculo = subcategoriaVeiculoRepository.save(subcategoriaVeiculo);
		return new ResponseEntity<>(subcategoriaVeiculo, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/mecanico",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByMecanico = subcategoriaVeiculoRepository.findByMecanico("1");
		return new ResponseEntity<>(findByMecanico, HttpStatus.OK);
	}
	@RequestMapping(value = "/eletrica",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissionalEletrica(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByEletrica = subcategoriaVeiculoRepository.findByAutoEletrico("1");
		return new ResponseEntity<>(findByEletrica, HttpStatus.OK);
	}
	@RequestMapping(value = "/instalador",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissionalInstaladorDeSom(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByInstaladorDeSom = subcategoriaVeiculoRepository.findByInstaladorDeSom("1");
		return new ResponseEntity<>(findByInstaladorDeSom, HttpStatus.OK);
	}
	@RequestMapping(value = "/guincho",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissionalGuincho(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByGuincho= subcategoriaVeiculoRepository.findByGuincho("1");
		return new ResponseEntity<>(findByGuincho, HttpStatus.OK);
	}
	@RequestMapping(value = "/funilaria",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissionalFunilaria(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByFunilaria= subcategoriaVeiculoRepository.findByFunilaria("1");
		return new ResponseEntity<>(findByFunilaria, HttpStatus.OK);
	}
	@RequestMapping(value = "/martelinho",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissionalMartelinhoDeOuro(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByMartelinhoDeOuro= subcategoriaVeiculoRepository.findByMartelinhoDeOuro("1");
		return new ResponseEntity<>(findByMartelinhoDeOuro, HttpStatus.OK);
	}
	@RequestMapping(value = "/borracheiro",
			method=RequestMethod.GET)
	public ResponseEntity<List<SubcategoriaVeiculo>> findByIdProfissionalBorracheiro(@PathVariable("idProfissional") Long idProfissional) {
		List<SubcategoriaVeiculo> findByBorracheiro= subcategoriaVeiculoRepository.findByBorracharia("1");
		return new ResponseEntity<>(findByBorracheiro, HttpStatus.OK);
	}
}