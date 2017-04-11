package br.com.webservice.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.Pedido;

/**
 * 
 * @author Caique dos Santos Coelho
 *
 */
public interface PedidoDAO extends JpaRepository<Pedido, Long> {
	
	List<Pedido> findByDataDeCadastro(LocalDate date);
	List<Pedido> findByIdCliente(Long idCliente);
}
