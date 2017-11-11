package br.com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SUBCATEGORIA_PET")
public class SubcategoriaPet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name= "ID")
	private Long id;
	
	@Column(name= "ID_PROFISSIONAL")
	private Long idProfissional;
	
	@Column(name= "PASSEADOR")
	private String passeador;
	
	@Column(name= "BANHO")
	private String banho;
	
	@Column(name= "HOSPEDAGEM")
	private String hospedagem;
	
	@Column(name= "TAXI")
	private String taxi;
	
	@Column(name= "ADESTRADOR")
	private String adestrador;
	
	@Column(name= "VETERINARIO")
	private String veterinario;
	
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

	
	public String getPasseador() {
		return passeador;
	}

	public void setPasseador(String passeador) {
		this.passeador = passeador;
	}

	public String getBanho() {
		return banho;
	}

	public void setBanho(String banho) {
		this.banho = banho;
	}

	public String getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(String hospedagem) {
		this.hospedagem = hospedagem;
	}

	public String getTaxi() {
		return taxi;
	}

	public void setTaxi(String taxi) {
		this.taxi = taxi;
	}

	public String getAdestrador() {
		return adestrador;
	}

	public void setAdestrador(String adestrador) {
		this.adestrador = adestrador;
	}

	public String getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}

	public Integer getMediaProfisional() {
		return mediaProfisional;
	}

	public void setMediaProfisional(Integer mediaProfisional) {
		this.mediaProfisional = mediaProfisional;
	}

}
