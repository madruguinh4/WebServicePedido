package br.com.webservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @author Caique dos Santos Coelho
 *
 */
@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	private Long idCliente;
	
	@OneToOne
	@Transient
	private Pedido pedido;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
}
