package br.com.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.webservice.dao.ClienteRepository;
import br.com.webservice.model.Cliente;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
		
	@Autowired
	private ClienteRepository clienteRepository;
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
		cliente = clienteRepository.save(cliente);
		System.out.println("passou aqui");
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{email}/{senha}",
					method=RequestMethod.GET)
	public Cliente findByEmailAndSenha(@PathVariable("email") String email,@PathVariable("senha") String senha) {
		
		Cliente cliente = clienteRepository.findByEmailAndSenha(email, senha);
		
		return cliente;
	}
}