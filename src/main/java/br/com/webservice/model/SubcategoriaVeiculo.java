package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_VEICULO")
public class SubcategoriaVeiculo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "MECANICO")
	private String mecanico;
	
	@Column(name= "AUTO_ELETRICO")
	private String autoEletrico;
	
	@Column(name= "INSTALADOR_DE_SOM")
	private String instaladorDeSom;
	
	@Column(name= "GUINCHO")
	private String guincho;
	
	@Column(name= "FUNILARIA")
	private String funilaria;
	
	@Column(name= "MARTELINHO_DE_OURO")
	private String martelinhoDeOuro;
	
	@Column(name= "BORRACHARIA")
	private String borracharia;
	
	@Column(name= "MEDIA_PROFISSIONAL")
	private Integer mediaProfisional;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(Long idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getMecanico() {
		return mecanico;
	}

	public void setMecanico(String mecanico) {
		this.mecanico = mecanico;
	}

	public String getAutoEletrico() {
		return autoEletrico;
	}

	public void setAutoEletrico(String autoEletrico) {
		this.autoEletrico = autoEletrico;
	}

	public String getInstaladorDeSom() {
		return instaladorDeSom;
	}

	public void setInstaladorDeSom(String instaladorDeSom) {
		this.instaladorDeSom = instaladorDeSom;
	}

	public String getGuincho() {
		return guincho;
	}

	public void setGuincho(String guincho) {
		this.guincho = guincho;
	}

	public String getFunilaria() {
		return funilaria;
	}

	public void setFunilaria(String funilaria) {
		this.funilaria = funilaria;
	}

	public String getMartelinhoDeOuro() {
		return martelinhoDeOuro;
	}

	public void setMartelinhoDeOuro(String martelinhoDeOuro) {
		this.martelinhoDeOuro = martelinhoDeOuro;
	}

	public String getBorracharia() {
		return borracharia;
	}

	public void setBorracharia(String borracharia) {
		this.borracharia = borracharia;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
