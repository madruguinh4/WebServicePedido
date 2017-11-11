package br.com.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.Profissional;


public interface ProfissionalRepository extends JpaRepository<Profissional, Long> {
	
	Profissional findByEmailAndSenha(String email, String senha);
}
