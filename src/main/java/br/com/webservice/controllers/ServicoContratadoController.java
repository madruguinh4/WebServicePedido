package br.com.webservice.controllers;

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
import br.com.webservice.dao.ServicoContratadoRepository;
import br.com.webservice.model.ServicoContratado;


@RestController
@RequestMapping("/api/servico-contratado")
public class ServicoContratadoController {
	
	@Autowired
	private ServicoContratadoRepository servicoContratadoRepository;
	
	@Autowired
	private ProfissionalRepository profissionalRepository;
	
	@RequestMapping(value = "/",
					method=RequestMethod.POST)
	public ResponseEntity<ServicoContratado> create(@RequestBody ServicoContratado servicoContratado) {
		servicoContratado = servicoContratadoRepository.save(servicoContratado);
		return new ResponseEntity<ServicoContratado>(servicoContratado, HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/{id}/{status}",
			method=RequestMethod.PUT)
	public ResponseEntity<ServicoContratado> update(@PathVariable("id") Long id,@PathVariable("status") Integer status) {
		ServicoContratado servicoContratado = servicoContratadoRepository.findOne(id);
		servicoContratado.setStatus(status);
		servicoContratadoRepository.save(servicoContratado);
		return new ResponseEntity<ServicoContratado>(servicoContratado, HttpStatus.OK);
	}	
	
	@RequestMapping(value = "/cliente/{idCliente}",
			method=RequestMethod.GET)
	public ResponseEntity<List<ServicoContratado>> findByCliente(@PathVariable("idCliente") Long idCliente) {
		List<ServicoContratado> servicoContratado = servicoContratadoRepository.findByIdCliente(idCliente);
		for (int i = 0; i < servicoContratado.size(); i++) {
			servicoContratado.get(i).setProfissional(profissionalRepository.findOne(servicoContratado.get(i).getIdProfissional()));
			
		}
		return new ResponseEntity<List<ServicoContratado>>(servicoContratado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/profissional/{idProfissional}",
			method=RequestMethod.GET)
	public ResponseEntity<List<ServicoContratado>> findByProfissional(@PathVariable("idProfissional") Long idProfissional) {
		List<ServicoContratado> servicoContratado = servicoContratadoRepository.findByIdProfissional(idProfissional);
		return new ResponseEntity<List<ServicoContratado>>(servicoContratado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}",
			method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") Long id) {
		servicoContratadoRepository.delete(id);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}