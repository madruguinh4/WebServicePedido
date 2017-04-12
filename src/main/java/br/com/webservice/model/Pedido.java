package br.com.webservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.webservice.converter.JsonBigDecDeserializer;
import br.com.webservice.converter.JsonDateSerializer;
import br.com.webservice.converter.JsonLocalDateDeserializer;
import br.com.webservice.converter.LocalDatePersistenceConverter;

/**
 * 
 * @author Caique dos Santos Coelho
 *
 */

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	private Long numeroDeControle;

	@Convert(converter = LocalDatePersistenceConverter.class)
	@JsonSerialize(using=JsonDateSerializer.class)
	@JsonDeserialize(using = JsonLocalDateDeserializer.class)
	private LocalDate dataDeCadastro;

	private String nomeDoProduto;
	

	@JsonDeserialize(using = JsonBigDecDeserializer.class)
	private BigDecimal valor;
	
	private Integer quantidade;
	
	@OneToOne
	private Cliente idCliente;
	
	public Long getNumeroDeControle() {
		return numeroDeControle;
	}

	public void setNumeroDeControle(Long numeroDeControle) {
		this.numeroDeControle = numeroDeControle;
	}

	public LocalDate getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(LocalDate dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
}