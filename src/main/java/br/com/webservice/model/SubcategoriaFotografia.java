package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_FOTOGRAFIA")
public class SubcategoriaFotografia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "CORPORATIVOS")
	private String corporativos;
	
	@Column(name= "INFANTIS")
	private String infantis;
	
	@Column(name= "CASAMENTO")
	private String casamento;
	
	@Column(name= "BATIZADO")
	private String batizado;
	
	@Column(name= "ANIVERSARIO")
	private String aniversario;
	
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
	
	public String getCorporativos() {
		return corporativos;
	}

	public void setCorporativos(String corporativos) {
		this.corporativos = corporativos;
	}

	public String getInfantis() {
		return infantis;
	}

	public void setInfantis(String infantis) {
		this.infantis = infantis;
	}

	public String getCasamento() {
		return casamento;
	}

	public void setCasamento(String casamento) {
		this.casamento = casamento;
	}

	public String getBatizado() {
		return batizado;
	}

	public void setBatizado(String batizado) {
		this.batizado = batizado;
	}

	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
