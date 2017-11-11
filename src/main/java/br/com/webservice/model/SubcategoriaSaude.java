package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_SAUDE")
public class SubcategoriaSaude {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "ACOMPANHANTE")
	private String acompanhante;
	
	@Column(name= "ENFERMEIRA")
	private String enfermeira;
	
	@Column(name= "FISIOTERAPEUTA")
	private String fisioterapeuta;
	
	@Column(name= "NUTRICIONISTA")
	private String nutricionista;
	
	@Column(name= "PSICOLOGO")
	private String psicologo;
	
	@Column(name= "CUIDADOR")
	private String cuidador;
	
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

	public String getAcompanhante() {
		return acompanhante;
	}

	public void setAcompanhante(String acompanhante) {
		this.acompanhante = acompanhante;
	}

	public String getEnfermeira() {
		return enfermeira;
	}

	public void setEnfermeira(String enfermeira) {
		this.enfermeira = enfermeira;
	}

	public String getFisioterapeuta() {
		return fisioterapeuta;
	}

	public void setFisioterapeuta(String fisioterapeuta) {
		this.fisioterapeuta = fisioterapeuta;
	}

	public String getNutricionista() {
		return nutricionista;
	}

	public void setNutricionista(String nutricionista) {
		this.nutricionista = nutricionista;
	}

	public String getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(String psicologo) {
		this.psicologo = psicologo;
	}

	public String getCuidador() {
		return cuidador;
	}

	public void setCuidador(String cuidador) {
		this.cuidador = cuidador;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
