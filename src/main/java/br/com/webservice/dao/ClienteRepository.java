package br.com.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	Cliente findByEmailAndSenha(String email, String senha);
}
