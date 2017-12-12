package br.com.webservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.webservice.model.ServicoContratado;

public interface ServicoContratadoRepository extends JpaRepository<ServicoContratado, Long> {

	List<ServicoContratado> findByIdClienteAndNotaIsNull(Long idCliente);

	List<ServicoContratado> findByIdProfissional(Long idProfissional);

}

