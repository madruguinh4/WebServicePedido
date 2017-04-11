package br.com.webservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.context.annotation.Bean;

import br.com.webservice.converter.LocalDatePersistenceConverter;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	private Long numeroDeControle;

	@Convert(converter = LocalDatePersistenceConverter.class)
	private LocalDate dataDeCadastro;

	@NotBlank
	private String nomeDoProduto;
	
	@NotBlank
	private BigDecimal valor;
	
	@NotBlank
	private Integer quantidade;
	
	@NotBlank
	private Long idCliente;

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

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
}