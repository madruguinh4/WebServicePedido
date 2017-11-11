package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_CURSO")
public class SubcategoriaCurso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "IDIOMAS")
	private String idiomas;
	
	@Column(name= "DANCA")
	private String danca;
	
	@Column(name= "MUSICA")
	private String musica;
	
	@Column(name= "JUDO")
	private String judo;
	
	@Column(name= "CULINARIA")
	private String culinaria;
	
	@Column(name= "ARTESANTO")
	private String artesanato;
	
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

	

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public String getDanca() {
		return danca;
	}

	public void setDanca(String danca) {
		this.danca = danca;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getJudo() {
		return judo;
	}

	public void setJudo(String judo) {
		this.judo = judo;
	}

	public String getCulinaria() {
		return culinaria;
	}

	public void setCulinaria(String culinaria) {
		this.culinaria = culinaria;
	}

	public String getArtesanato() {
		return artesanato;
	}

	public void setArtesanato(String artesanato) {
		this.artesanato = artesanato;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
