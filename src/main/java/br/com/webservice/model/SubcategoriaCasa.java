package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_CASA")
public class SubcategoriaCasa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "ELETRICISTA")
	private String eletricista;
	
	@Column(name= "PINTOR")
	private String pintor;
	
	@Column(name= "DIARISTA")
	private String diarista;
	
	@Column(name= "COZINHEIRA")
	private String cozinheira;
	
	@Column(name= "JARDINEIRO")
	private String jardineiro;
	
	@Column(name= "MOTORISTA")
	private String motorista;
	
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

	public String getEletricista() {
		return eletricista;
	}

	public void setEletricista(String eletricista) {
		this.eletricista = eletricista;
	}

	public String getPintor() {
		return pintor;
	}

	public void setPintor(String pintor) {
		this.pintor = pintor;
	}

	public String getDiarista() {
		return diarista;
	}

	public void setDiarista(String diarista) {
		this.diarista = diarista;
	}

	public String getCozinheira() {
		return cozinheira;
	}

	public void setCozinheira(String cozinheira) {
		this.cozinheira = cozinheira;
	}

	public String getJardineiro() {
		return jardineiro;
	}

	public void setJardineiro(String jardineiro) {
		this.jardineiro = jardineiro;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
