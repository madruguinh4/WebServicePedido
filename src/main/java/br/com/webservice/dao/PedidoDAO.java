package br.com.webservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Long> {
	
}
