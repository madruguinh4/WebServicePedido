package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_TECNOLOGIA")
public class SubcategoriaTecnologia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "ANIMACAO")
	private String animacao;
	
	@Column(name= "DESENVOLVIMENTO")
	private String desenvolvimento;
	
	@Column(name= "AUDIO")
	private String audio;
	
	@Column(name= "ILUSTRACAO")
	private String ilustracao;
	
	@Column(name= "MARKETING")
	private String marketing;
	
	@Column(name= "MODELAGEM")
	private String modelagem;
	
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

	
	public String getAnimacao() {
		return animacao;
	}

	public void setAnimacao(String animacao) {
		this.animacao = animacao;
	}

	public String getDesenvolvimento() {
		return desenvolvimento;
	}

	public void setDesenvolvimento(String desenvolvimento) {
		this.desenvolvimento = desenvolvimento;
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getIlustracao() {
		return ilustracao;
	}

	public void setIlustracao(String ilustracao) {
		this.ilustracao = ilustracao;
	}

	public String getMarketing() {
		return marketing;
	}

	public void setMarketing(String marketing) {
		this.marketing = marketing;
	}

	public String getModelagem() {
		return modelagem;
	}

	public void setModelagem(String modelagem) {
		this.modelagem = modelagem;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
